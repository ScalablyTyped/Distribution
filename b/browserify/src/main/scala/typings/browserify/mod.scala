package typings.browserify

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.browserify.browserifyStrings._package
import typings.browserify.browserifyStrings.bundle
import typings.browserify.browserifyStrings.file
import typings.browserify.browserifyStrings.reset
import typings.browserify.browserifyStrings.transform
import typings.insertModuleGlobals.mod.VarsOption
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("browserify", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BrowserifyObject {
    def this(files: js.Array[InputFile]) = this()
    def this(file: InputFile) = this()
    def this(opts: Options) = this()
    def this(files: js.Array[InputFile], opts: Options) = this()
    def this(file: InputFile, opts: Options) = this()
  }
  @JSImport("browserify", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BrowserifyConstructor = js.native
  
  @js.native
  trait BrowserifyConstructor
    extends StObject
       with Instantiable0[BrowserifyObject]
       with Instantiable1[
          (/* files */ js.Array[InputFile]) | (/* file */ InputFile) | (/* opts */ Options), 
          BrowserifyObject
        ]
       with Instantiable2[
          (/* files */ js.Array[InputFile]) | (/* file */ InputFile), 
          /* opts */ Options, 
          BrowserifyObject
        ] {
    
    def apply(): BrowserifyObject = js.native
    def apply(files: js.Array[InputFile]): BrowserifyObject = js.native
    def apply(files: js.Array[InputFile], opts: Options): BrowserifyObject = js.native
    def apply(file: InputFile): BrowserifyObject = js.native
    def apply(file: InputFile, opts: Options): BrowserifyObject = js.native
    def apply(opts: Options): BrowserifyObject = js.native
  }
  
  @js.native
  trait BrowserifyObject
    extends StObject
       with EventEmitter {
    
    def add(file: js.Array[InputFile]): BrowserifyObject = js.native
    def add(file: js.Array[InputFile], opts: FileOptions): BrowserifyObject = js.native
    /**
      * Add an entry file from file that will be executed when the bundle loads.
      * If file is an array, each item in file will be added as an entry file.
      */
    def add(file: InputFile): BrowserifyObject = js.native
    def add(file: InputFile, opts: FileOptions): BrowserifyObject = js.native
    
    /**
      * Bundle the files and their dependencies into a single javascript file.
      * Return a readable stream with the javascript file contents or optionally specify a cb(err, buf) to get the buffered results.
      */
    def bundle(): ReadableStream = js.native
    def bundle(cb: js.Function2[/* err */ Any, /* src */ Buffer, Any]): ReadableStream = js.native
    
    /**
      * Prevent the module name or file at file from showing up in the output bundle.
      * If your code tries to require() that file it will throw unless you've provided another mechanism for loading it.
      */
    def exclude(file: String): BrowserifyObject = js.native
    def exclude(file: String, opts: CustomOptions): BrowserifyObject = js.native
    
    def external(file: String): BrowserifyObject = js.native
    def external(file: String, opts: CustomOptions): BrowserifyObject = js.native
    /**
      * Prevent file from being loaded into the current bundle, instead referencing from another bundle.
      * If file is an array, each item in file will be externalized.
      * If file is another bundle, that bundle's contents will be read and excluded from the current bundle as the bundle in file gets bundled.
      */
    def external(file: js.Array[String]): BrowserifyObject = js.native
    def external(file: js.Array[String], opts: CustomOptions): BrowserifyObject = js.native
    def external(file: BrowserifyObject): BrowserifyObject = js.native
    
    /**
      * Prevent the module name or file at file from showing up in the output bundle.
      * Instead you will get a file with module.exports = {}.
      */
    def ignore(file: String): BrowserifyObject = js.native
    def ignore(file: String, opts: CustomOptions): BrowserifyObject = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    /**
      * When .bundle() is called, this event fires with the bundle output stream.
      */
    @JSName("on")
    def on_bundle(event: bundle, listener: js.Function1[/* bundle */ ReadableStream, Any]): this.type = js.native
    /**
      * When a file is resolved for the bundle, the bundle emits a 'file' event with the full file path, the id string passed to require(), and the parent object used by browser-resolve.
      * You could use the file event to implement a file watcher to regenerate bundles when files change.
      */
    @JSName("on")
    def on_file(event: file, listener: js.Function3[/* file */ String, /* id */ String, /* parent */ Any, Any]): this.type = js.native
    /**
      * When a package.json file is read, this event fires with the contents.
      * The package directory is available at pkg.__dirname.
      */
    @JSName("on")
    def on_package(event: _package, listener: js.Function1[/* pkg */ Any, Any]): this.type = js.native
    /**
      * When the .reset() method is called or implicitly called by another call to .bundle(), this event fires.
      */
    @JSName("on")
    def on_reset(event: reset, listener: js.Function0[Any]): this.type = js.native
    /**
      * When a transform is applied to a file, the 'transform' event fires on the bundle stream with the transform stream tr and the file that the transform is being applied to.
      */
    @JSName("on")
    def on_transform(event: transform, listener: js.Function2[/* tr */ ReadWriteStream, /* file */ String, Any]): this.type = js.native
    
    /**
      * Set to any until substack/labeled-stream-splicer is defined
      */
    var pipeline: Any = js.native
    
    /**
      * Register a plugin with opts. Plugins can be a string module name or a function the same as transforms.
      * plugin(b, opts) is called with the Browserify instance b.
      */
    def plugin[T /* <: CustomOptions */](plugin: String): BrowserifyObject = js.native
    def plugin[T /* <: CustomOptions */](plugin: String, opts: T): BrowserifyObject = js.native
    def plugin[T /* <: CustomOptions */](plugin: js.Function2[/* b */ this.type, /* opts */ T, Any]): BrowserifyObject = js.native
    def plugin[T /* <: CustomOptions */](plugin: js.Function2[/* b */ this.type, /* opts */ T, Any], opts: T): BrowserifyObject = js.native
    
    /**
      * Make file available from outside the bundle with require(file).
      * The file param is anything that can be resolved by require.resolve().
      * file can also be a stream, but you should also use opts.basedir so that relative requires will be resolvable.
      * If file is an array, each item in file will be required. In file array form, you can use a string or object for each item. Object items should have a file property and the rest of the parameters will be used for the opts.
      * Use the expose property of opts to specify a custom dependency name. require('./vendor/angular/angular.js', {expose: 'angular'}) enables require('angular')
      */
    def require(file: InputFile): BrowserifyObject = js.native
    def require(file: InputFile, opts: FileOptions): BrowserifyObject = js.native
    
    /**
      * Reset the pipeline back to a normal state. This function is called automatically when bundle() is called multiple times.
      * This function triggers a 'reset' event.
      */
    def reset(): Unit = js.native
    def reset(opts: Options): Unit = js.native
    
    /**
      * Transform source code before parsing it for require() calls with the transform function or module name tr.
      * If tr is a function, it will be called with tr(file) and it should return a through-stream that takes the raw file contents and produces the transformed source.
      * If tr is a string, it should be a module name or file path of a transform module
      */
    def transform[T /* <: CustomOptions */](tr: String): BrowserifyObject = js.native
    def transform[T /* <: CustomOptions */](tr: String, opts: T): BrowserifyObject = js.native
    def transform[T /* <: CustomOptions */](tr: js.Function2[/* file */ String, /* opts */ T, ReadWriteStream]): BrowserifyObject = js.native
    def transform[T /* <: CustomOptions */](tr: js.Function2[/* file */ String, /* opts */ T, ReadWriteStream], opts: T): BrowserifyObject = js.native
  }
  
  /**
    * Core options pertaining to a Browserify instance, extended by user options
    */
  trait CustomOptions
    extends StObject
       with /**
    * Custom properties can be defined on Options.
    * These options are forwarded along to module-deps and browser-pack directly.
    */
  /* propName */ StringDictionary[Any] {
    
    /** the directory that Browserify starts bundling from for filenames that start with .. */
    var basedir: js.UndefOr[String] = js.undefined
  }
  object CustomOptions {
    
    inline def apply(): CustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomOptions]
    }
    
    extension [Self <: CustomOptions](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
    }
  }
  
  /**
    * Options pertaining to an individual file.
    */
  trait FileOptions extends StObject {
    
    // Basedir to use to resolve this file's path.
    var basedir: js.UndefOr[String] = js.undefined
    
    // If true, this is considered an entry point to your app.
    var entry: js.UndefOr[Boolean] = js.undefined
    
    // Expose this file under a custom dependency name.
    // require('./vendor/angular/angular.js', {expose: 'angular'}) enables require('angular')
    var expose: js.UndefOr[String] = js.undefined
    
    // Forward file to external() to be externalized.
    var external: js.UndefOr[Boolean] = js.undefined
    
    // The name/path to the file.
    var file: js.UndefOr[String] = js.undefined
    
    // The ID to use for require() statements.
    var id: js.UndefOr[String] = js.undefined
    
    // Disable transforms on file if set to false.
    var transform: js.UndefOr[Boolean] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setExpose(value: String): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTransform(value: Boolean): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  // Browserify accepts a filename, an input stream for file inputs, or a FileOptions configuration
  // for each file in a bundle.
  type InputFile = String | ReadableStream | FileOptions
  
  /**
    * Options pertaining to a Browserify instance.
    */
  trait Options
    extends StObject
       with CustomOptions {
    
    // sets the list of built-ins to use, which by default is set in lib/builtins.js in this distribution.
    var builtins: js.UndefOr[js.Array[String] | StringDictionary[String] | Boolean] = js.undefined
    
    // set if external modules should be bundled. Defaults to true.
    var bundleExternal: js.UndefOr[Boolean] = js.undefined
    
    // sets the algorithm used to parse out the common paths. Use false to turn this off, otherwise it uses the commondir module.
    var commondir: js.UndefOr[Boolean] = js.undefined
    
    // When true, add a source map inline to the end of the bundle. This makes debugging easier because you can see all the original files if you are in a modern enough browser.
    var debug: js.UndefOr[Boolean] = js.undefined
    
    // When true, scan all files for process, global, __filename, and __dirname, defining as necessary.
    // With this option npm modules are more likely to work but bundling takes longer. Default true.
    var detectGlobals: js.UndefOr[Boolean] = js.undefined
    
    // String, file object, or array of those types (they may be mixed) specifying entry file(s).
    var entries: js.UndefOr[InputFile | js.Array[InputFile]] = js.undefined
    
    // an array of optional extra extensions for the module lookup machinery to use when the extension has not been specified.
    // By default Browserify considers only .js and .json files in such cases.
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    // defaults to 'require' in expose mode but you can use another name.
    var externalRequireName: js.UndefOr[String] = js.undefined
    
    // disables converting module ids into numerical indexes. This is useful for preserving the original paths that a bundle was generated with.
    var fullPaths: js.UndefOr[Boolean] = js.undefined
    
    // will be passed to insert-module-globals as the opts.vars parameter.
    var insertGlobalVars: js.UndefOr[VarsOption] = js.undefined
    
    // When true, always insert process, global, __filename, and __dirname without analyzing the AST for faster builds but larger output bundles. Default false.
    var insertGlobals: js.UndefOr[Boolean] = js.undefined
    
    // an array which will skip all require() and global parsing for each file in the array.
    // Use this for giant libs like jquery or threejs that don't have any requires or node-style globals but take forever to parse.
    var noParse: js.UndefOr[js.Array[String]] = js.undefined
    
    // an array of directories that Browserify searches when looking for modules which are not referenced using relative path.
    // Can be absolute or relative to basedir. Equivalent of setting NODE_PATH environmental variable when calling Browserify command.
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    // When a non-empty string, a standalone module is created with that name and a umd wrapper.
    // You can use namespaces in the standalone global export using a . in the string name as a separator, for example 'A.B.C'.
    // The global export will be sanitized and camel cased.
    var standalone: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuiltins(value: js.Array[String] | StringDictionary[String] | Boolean): Self = StObject.set(x, "builtins", value.asInstanceOf[js.Any])
      
      inline def setBuiltinsUndefined: Self = StObject.set(x, "builtins", js.undefined)
      
      inline def setBuiltinsVarargs(value: String*): Self = StObject.set(x, "builtins", js.Array(value*))
      
      inline def setBundleExternal(value: Boolean): Self = StObject.set(x, "bundleExternal", value.asInstanceOf[js.Any])
      
      inline def setBundleExternalUndefined: Self = StObject.set(x, "bundleExternal", js.undefined)
      
      inline def setCommondir(value: Boolean): Self = StObject.set(x, "commondir", value.asInstanceOf[js.Any])
      
      inline def setCommondirUndefined: Self = StObject.set(x, "commondir", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDetectGlobals(value: Boolean): Self = StObject.set(x, "detectGlobals", value.asInstanceOf[js.Any])
      
      inline def setDetectGlobalsUndefined: Self = StObject.set(x, "detectGlobals", js.undefined)
      
      inline def setEntries(value: InputFile | js.Array[InputFile]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: InputFile*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setExternalRequireName(value: String): Self = StObject.set(x, "externalRequireName", value.asInstanceOf[js.Any])
      
      inline def setExternalRequireNameUndefined: Self = StObject.set(x, "externalRequireName", js.undefined)
      
      inline def setFullPaths(value: Boolean): Self = StObject.set(x, "fullPaths", value.asInstanceOf[js.Any])
      
      inline def setFullPathsUndefined: Self = StObject.set(x, "fullPaths", js.undefined)
      
      inline def setInsertGlobalVars(value: VarsOption): Self = StObject.set(x, "insertGlobalVars", value.asInstanceOf[js.Any])
      
      inline def setInsertGlobalVarsUndefined: Self = StObject.set(x, "insertGlobalVars", js.undefined)
      
      inline def setInsertGlobals(value: Boolean): Self = StObject.set(x, "insertGlobals", value.asInstanceOf[js.Any])
      
      inline def setInsertGlobalsUndefined: Self = StObject.set(x, "insertGlobals", js.undefined)
      
      inline def setNoParse(value: js.Array[String]): Self = StObject.set(x, "noParse", value.asInstanceOf[js.Any])
      
      inline def setNoParseUndefined: Self = StObject.set(x, "noParse", js.undefined)
      
      inline def setNoParseVarargs(value: String*): Self = StObject.set(x, "noParse", js.Array(value*))
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    }
  }
  
  type _To = js.Object & BrowserifyConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & BrowserifyConstructor = ^
}
