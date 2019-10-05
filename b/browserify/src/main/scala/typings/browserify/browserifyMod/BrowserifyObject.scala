package typings.browserify.browserifyMod

import typings.browserify.browserifyStrings.PACKAGE
import typings.browserify.browserifyStrings.bundle
import typings.browserify.browserifyStrings.file
import typings.browserify.browserifyStrings.reset
import typings.browserify.browserifyStrings.transform
import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserifyObject extends EventEmitter {
  /**
    * Set to any until substack/labeled-stream-splicer is defined
    */
  var pipeline: js.Any = js.native
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
  def bundle(cb: js.Function2[/* err */ js.Any, /* src */ Buffer, _]): ReadableStream = js.native
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
  def on_bundle(event: bundle, listener: js.Function1[/* bundle */ ReadableStream, _]): this.type = js.native
  /**
    * When a file is resolved for the bundle, the bundle emits a 'file' event with the full file path, the id string passed to require(), and the parent object used by browser-resolve.
    * You could use the file event to implement a file watcher to regenerate bundles when files change.
    */
  @JSName("on")
  def on_file(event: file, listener: js.Function3[/* file */ String, /* id */ String, /* parent */ js.Any, _]): this.type = js.native
  /**
    * When a package.json file is read, this event fires with the contents.
    * The package directory is available at pkg.__dirname.
    */
  @JSName("on")
  def on_package(event: PACKAGE, listener: js.Function1[/* pkg */ js.Any, _]): this.type = js.native
  /**
    * When the .reset() method is called or implicitly called by another call to .bundle(), this event fires.
    */
  @JSName("on")
  def on_reset(event: reset, listener: js.Function0[_]): this.type = js.native
  /**
    * When a transform is applied to a file, the 'transform' event fires on the bundle stream with the transform stream tr and the file that the transform is being applied to.
    */
  @JSName("on")
  def on_transform(event: transform, listener: js.Function2[/* tr */ ReadWriteStream, /* file */ String, _]): this.type = js.native
  /**
    * Register a plugin with opts. Plugins can be a string module name or a function the same as transforms.
    * plugin(b, opts) is called with the Browserify instance b.
    */
  def plugin[T /* <: CustomOptions */](plugin: String): BrowserifyObject = js.native
  def plugin[T /* <: CustomOptions */](plugin: String, opts: T): BrowserifyObject = js.native
  def plugin[T /* <: CustomOptions */](plugin: js.Function2[/* b */ this.type, /* opts */ T, _]): BrowserifyObject = js.native
  def plugin[T /* <: CustomOptions */](plugin: js.Function2[/* b */ this.type, /* opts */ T, _], opts: T): BrowserifyObject = js.native
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

