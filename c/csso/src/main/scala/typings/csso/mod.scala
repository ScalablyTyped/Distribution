package typings.csso

import org.scalablytyped.runtime.Instantiable0
import typings.cssTree.mod.CssNode
import typings.cssTree.mod.CssNodePlain
import typings.cssTree.mod.DefinitionSyntax_
import typings.cssTree.mod.EnterOrLeaveFn
import typings.cssTree.mod.FindFn
import typings.cssTree.mod.GenerateOptions
import typings.cssTree.mod.Keyword_
import typings.cssTree.mod.ParseOptions
import typings.cssTree.mod.Property_
import typings.cssTree.mod.WalkOptions
import typings.csso.anon.Ast
import typings.csso.anon.Classes
import typings.csso.anon.Typeofident
import typings.csso.anon.Typeofstring
import typings.csso.anon.Typeofurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def minify(source: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(source.asInstanceOf[js.Any]).asInstanceOf[Result]
  inline def minify(source: String, options: MinifyOptions & CompressOptions): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  inline def minifyBlock(source: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("minifyBlock")(source.asInstanceOf[js.Any]).asInstanceOf[Result]
  inline def minifyBlock(source: String, options: MinifyOptions & CompressOptions): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("minifyBlock")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  /* Inlined {readonly findAll (ast : css-tree.css-tree.CssNode, fn : css-tree.css-tree.FindFn): std.Array<css-tree.css-tree.CssNode>,  readonly url :{readonly decode (input : string): string, readonly encode (input : string): string},  readonly ident :{readonly decode (input : string): string, readonly encode (input : string): string}, readonly clone (node : css-tree.css-tree.CssNode): css-tree.css-tree.CssNode, readonly walk (ast : css-tree.css-tree.CssNode, options : css-tree.css-tree.EnterOrLeaveFn<css-tree.css-tree.CssNode>): void, readonly walk (ast : css-tree.css-tree.CssNode, options : css-tree.css-tree.WalkOptions): void,  readonly string :{readonly encode (input : string): string, readonly encode (input : string, apostrophe : boolean): string, readonly decode (input : string): string}, readonly find (ast : css-tree.css-tree.CssNode, fn : css-tree.css-tree.FindFn): css-tree.css-tree.CssNode, readonly findLast (ast : css-tree.css-tree.CssNode, fn : css-tree.css-tree.FindFn): css-tree.css-tree.CssNode,   List :new <TData>(): css-tree.css-tree.List<TData>, readonly keyword (value : string): css-tree.css-tree.Keyword, readonly generate (ast : css-tree.css-tree.CssNode): string, readonly generate (ast : css-tree.css-tree.CssNode, options : css-tree.css-tree.GenerateOptions): string,  readonly definitionSyntax :css-tree.css-tree.DefinitionSyntax, readonly property (value : string): css-tree.css-tree.Property, readonly fromPlainObject (node : css-tree.css-tree.CssNodePlain): css-tree.css-tree.CssNode, readonly toPlainObject (node : css-tree.css-tree.CssNode): css-tree.css-tree.CssNodePlain, readonly parse (text : string): css-tree.css-tree.CssNode, readonly parse (text : string, options : css-tree.css-tree.ParseOptions): css-tree.css-tree.CssNode} & {compress (ast : css-tree.css-tree.CssNode, options : csso.csso.CompressOptions | undefined): {  ast :css-tree.css-tree.CssNode}} */
  object syntax {
    
    @JSImport("csso", "syntax")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("csso", "syntax.List")
    @js.native
    open class List[TData] ()
      extends typings.cssTree.mod.List[TData]
    @JSImport("csso", "syntax.List")
    @js.native
    def List: Instantiable0[typings.cssTree.mod.List[js.Object]] = js.native
    inline def List_=(x: Instantiable0[typings.cssTree.mod.List[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
    
    inline def clone_(node: CssNode): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[CssNode]
    
    /**
      * Does the main task – compress an AST.
      */
    inline def compress(ast: CssNode): Ast = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(ast.asInstanceOf[js.Any]).asInstanceOf[Ast]
    inline def compress(ast: CssNode, options: CompressOptions): Ast = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Ast]
    
    @JSImport("csso", "syntax.definitionSyntax")
    @js.native
    val definitionSyntax: DefinitionSyntax_ = js.native
    
    inline def find(ast: CssNode, fn: FindFn): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CssNode]
    
    inline def findAll(ast: CssNode, fn: FindFn): js.Array[CssNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[CssNode]]
    
    inline def findLast(ast: CssNode, fn: FindFn): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CssNode]
    
    inline def fromPlainObject(node: CssNodePlain): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[CssNode]
    
    inline def generate(ast: CssNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generate(ast: CssNode, options: GenerateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("csso", "syntax.ident")
    @js.native
    val ident: Typeofident = js.native
    
    inline def keyword(value: String): Keyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(value.asInstanceOf[js.Any]).asInstanceOf[Keyword_]
    
    inline def parse(text: String): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[CssNode]
    inline def parse(text: String, options: ParseOptions): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssNode]
    
    inline def property(value: String): Property_ = ^.asInstanceOf[js.Dynamic].applyDynamic("property")(value.asInstanceOf[js.Any]).asInstanceOf[Property_]
    
    @JSImport("csso", "syntax.string")
    @js.native
    val string: Typeofstring = js.native
    
    inline def toPlainObject(node: CssNode): CssNodePlain = ^.asInstanceOf[js.Dynamic].applyDynamic("toPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[CssNodePlain]
    
    @JSImport("csso", "syntax.url")
    @js.native
    val url: Typeofurl = js.native
    
    inline def walk(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def walk(ast: CssNode, options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("csso", "version")
  @js.native
  val version: String = js.native
  
  type AfterCompressFn = js.Function2[/* compressResult */ String, /* options */ CompressOptions, Unit]
  
  type BeforeCompressFn = js.Function2[/* ast */ js.Object, /* options */ CompressOptions, Unit]
  
  trait CompressOptions extends StObject {
    
    /**
      * Transform a copy of input AST if true. Useful in case of AST reuse.
      * @default false
      */
    @JSName("clone")
    var clone_FCompressOptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify what comments to leave:
      * - 'exclamation' or true – leave all exclamation comments
      * - 'first-exclamation' – remove every comment except first one
      * - false – remove all comments
      * @default true
      */
    var comments: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Enables merging of @media rules with the same media query by splitted by other rules.
      * The optimisation is unsafe in general, but should work fine in most cases. Use it on your own risk.
      * @default false
      */
    var forceMediaMerge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to track every step of transformation.
      */
    var logger: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Disable or enable a structure optimisations.
      * @default true
      */
    var restructure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Usage data for advanced optimisations.
      */
    var usage: js.UndefOr[Usage] = js.undefined
  }
  object CompressOptions {
    
    inline def apply(): CompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setComments(value: String | Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setForceMediaMerge(value: Boolean): Self = StObject.set(x, "forceMediaMerge", value.asInstanceOf[js.Any])
      
      inline def setForceMediaMergeUndefined: Self = StObject.set(x, "forceMediaMerge", js.undefined)
      
      inline def setLogger(value: () => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction0(value))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setRestructure(value: Boolean): Self = StObject.set(x, "restructure", value.asInstanceOf[js.Any])
      
      inline def setRestructureUndefined: Self = StObject.set(x, "restructure", js.undefined)
      
      inline def setUsage(value: Usage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  trait MinifyOptions extends StObject {
    
    /**
      * Called right after compress() is run.
      */
    var afterCompress: js.UndefOr[AfterCompressFn | js.Array[AfterCompressFn]] = js.undefined
    
    /**
      * Called right after parse is run.
      */
    var beforeCompress: js.UndefOr[BeforeCompressFn | js.Array[BeforeCompressFn]] = js.undefined
    
    /**
      * Output debug information to stderr.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filename of input CSS, uses for source map generation.
      * @default '<unknown>'
      */
    var filename: js.UndefOr[String] = js.undefined
    
    var restructure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Generate a source map when true.
      * @default false
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object MinifyOptions {
    
    inline def apply(): MinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinifyOptions] (val x: Self) extends AnyVal {
      
      inline def setAfterCompress(value: AfterCompressFn | js.Array[AfterCompressFn]): Self = StObject.set(x, "afterCompress", value.asInstanceOf[js.Any])
      
      inline def setAfterCompressFunction2(value: (/* compressResult */ String, /* options */ CompressOptions) => Unit): Self = StObject.set(x, "afterCompress", js.Any.fromFunction2(value))
      
      inline def setAfterCompressUndefined: Self = StObject.set(x, "afterCompress", js.undefined)
      
      inline def setAfterCompressVarargs(value: AfterCompressFn*): Self = StObject.set(x, "afterCompress", js.Array(value*))
      
      inline def setBeforeCompress(value: BeforeCompressFn | js.Array[BeforeCompressFn]): Self = StObject.set(x, "beforeCompress", value.asInstanceOf[js.Any])
      
      inline def setBeforeCompressFunction2(value: (/* ast */ js.Object, /* options */ CompressOptions) => Unit): Self = StObject.set(x, "beforeCompress", js.Any.fromFunction2(value))
      
      inline def setBeforeCompressUndefined: Self = StObject.set(x, "beforeCompress", js.undefined)
      
      inline def setBeforeCompressVarargs(value: BeforeCompressFn*): Self = StObject.set(x, "beforeCompress", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setRestructure(value: Boolean): Self = StObject.set(x, "restructure", value.asInstanceOf[js.Any])
      
      inline def setRestructureUndefined: Self = StObject.set(x, "restructure", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    /**
      * Resulting CSS.
      */
    var css: String
    
    /**
      * Instance of SourceMapGenerator or null.
      */
    var map: js.Object | Null
  }
  object Result {
    
    inline def apply(css: String): Result = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
    }
  }
  
  trait Usage extends StObject {
    
    var blacklist: js.UndefOr[Classes] = js.undefined
    
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var scopes: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Usage {
    
    inline def apply(): Usage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Usage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Usage] (val x: Self) extends AnyVal {
      
      inline def setBlacklist(value: Classes): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setScopes(value: js.Array[js.Array[String]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: js.Array[String]*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
