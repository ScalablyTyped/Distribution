package typings.babelHelperModuleImports

import typings.babelHelperModuleImports.anon.OmitPartialImportOptionse
import typings.babelHelperModuleImports.anon.OmitPartialImportOptionseBlockHoist
import typings.babelHelperModuleImports.anon.OmitPartialImportOptionseEnsureLiveReference
import typings.babelHelperModuleImports.anon.PartialImportOptions
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.after
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.babel
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.before
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.commonjs
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.compiled
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.es6
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.node
import typings.babelHelperModuleImports.babelHelperModuleImportsStrings.uncompiled
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.MemberExpression_
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.SequenceExpression_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/helper-module-imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@babel/helper-module-imports", "ImportInjector")
  @js.native
  open class ImportInjector protected () extends StObject {
    def this(path: NodePath[Node]) = this()
    def this(path: NodePath[Node], importedSource: String) = this()
    def this(path: NodePath[Node], importedSource: String, opts: PartialImportOptions) = this()
    def this(path: NodePath[Node], importedSource: Unit, opts: PartialImportOptions) = this()
    
    def addDefault(importedSourceIn: String, opts: PartialImportOptions): Identifier_ = js.native
    
    def addNamed(importName: String, importedSourceIn: String, opts: PartialImportOptions): Identifier_ = js.native
    
    def addNamespace(importedSourceIn: String, opts: PartialImportOptions): Identifier_ = js.native
    
    def addSideEffect(importedSourceIn: String, opts: PartialImportOptions): Unit = js.native
  }
  
  inline def addDefault(path: NodePath[Node], importedSource: String): Identifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addDefault")(path.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any])).asInstanceOf[Identifier_]
  inline def addDefault(path: NodePath[Node], importedSource: String, opts: PartialImportOptions): Identifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addDefault")(path.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Identifier_]
  
  inline def addNamed(path: NodePath[Node], name: String, importedSource: String): Identifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamed")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any])).asInstanceOf[Identifier_]
  inline def addNamed(path: NodePath[Node], name: String, importedSource: String, opts: OmitPartialImportOptionse): Identifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamed")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Identifier_]
  inline def addNamed(
    path: NodePath[Node],
    name: String,
    importedSource: String,
    opts: OmitPartialImportOptionseBlockHoist
  ): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamed")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
  inline def addNamed(
    path: NodePath[Node],
    name: String,
    importedSource: String,
    opts: OmitPartialImportOptionseEnsureLiveReference
  ): SequenceExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamed")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SequenceExpression_]
  
  inline def addNamed_MemberExpression_(path: NodePath[Node], name: String, importedSource: String): MemberExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamed")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any])).asInstanceOf[MemberExpression_]
  
  inline def addNamed_SequenceExpression_(path: NodePath[Node], name: String, importedSource: String): SequenceExpression_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamed")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any])).asInstanceOf[SequenceExpression_]
  
  inline def addNamespace(path: NodePath[Node], importedSource: String): Identifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamespace")(path.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any])).asInstanceOf[Identifier_]
  inline def addNamespace(path: NodePath[Node], importedSource: String, opts: PartialImportOptions): Identifier_ = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamespace")(path.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Identifier_]
  
  inline def addSideEffect(path: NodePath[Node], importedSource: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSideEffect")(path.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSideEffect(path: NodePath[Node], importedSource: String, opts: PartialImportOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSideEffect")(path.asInstanceOf[js.Any], importedSource.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isModule(path: NodePath[Program_]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ImportOptions extends StObject {
    
    var blockHoist: js.UndefOr[Double] = js.undefined
    
    /**
      * Define whether we explicitly care that the import be a live reference.
      * Only applies when importing default and named imports, not the namespace.
      *
      *  * true  - Force imported values to be live references.
      *  * false - No particular requirements. Keeps the code simplest. (Default)
      */
    var ensureLiveReference: Boolean
    
    /**
      * Define if we explicitly care that the result not be a property reference.
      *
      *  * true  - Force calls to exclude context. Useful if the value is going to
      *            be used as function callee.
      *  * false - No particular requirements for context of the access. (Default)
      */
    var ensureNoContext: Boolean
    
    /**
      * Define whether the import should be loaded before or after the existing imports.
      * "after" is only allowed inside ECMAScript modules, since it's not possible to
      * reliably pick the location _after_ require() calls but _before_ other code in CJS.
      */
    var importPosition: before | after
    
    /**
      * The type of interop behavior for namespace/default/named when loading
      * CommonJS modules.
      *
      * ## 'babel' (Default)
      *
      * Load using Babel's interop.
      *
      * If '.__esModule' is true, treat as 'compiled', else:
      *
      * * Namespace: A copy of the module.exports with .default
      *     populated by the module.exports object.
      * * Default: The module.exports value.
      * * Named: The .named property of module.exports.
      *
      * The 'ensureLiveReference' has no effect on the liveness of these.
      *
      * ## 'compiled'
      *
      * Assume the module is ES6 compiled to CommonJS. Useful to avoid injecting
      * interop logic if you are confident that the module is a certain format.
      *
      * * Namespace: The root module.exports object.
      * * Default: The .default property of the namespace.
      * * Named: The .named property of the namespace.
      *
      * Will return erroneous results if the imported module is _not_ compiled
      * from ES6 with Babel.
      *
      * ## 'uncompiled'
      *
      * Assume the module is _not_ ES6 compiled to CommonJS. Used a simplified
      * access pattern that doesn't require additional function calls.
      *
      * Will return erroneous results if the imported module _is_ compiled
      * from ES6 with Babel.
      *
      * * Namespace: The module.exports object.
      * * Default: The module.exports object.
      * * Named: The .named property of module.exports.
      */
    var importedInterop: babel | node | compiled | uncompiled
    
    /**
      * The module being referenced.
      */
    var importedSource: String | Null
    
    /**
      * The type of module being imported:
      *
      *  * 'es6'      - An ES6 module.
      *  * 'commonjs' - A CommonJS module. (Default)
      */
    var importedType: es6 | commonjs
    
    /**
      * The type of CommonJS interop included in the environment that will be
      * loading the output code.
      *
      *  * 'babel' - CommonJS modules load with Babel's interop. (Default)
      *  * 'node'  - CommonJS modules load with Node's interop.
      *
      * See descriptions in 'importedInterop' for more details.
      */
    var importingInterop: babel | node
    
    var nameHint: js.UndefOr[String] = js.undefined
  }
  object ImportOptions {
    
    inline def apply(
      ensureLiveReference: Boolean,
      ensureNoContext: Boolean,
      importPosition: before | after,
      importedInterop: babel | node | compiled | uncompiled,
      importedType: es6 | commonjs,
      importingInterop: babel | node
    ): ImportOptions = {
      val __obj = js.Dynamic.literal(ensureLiveReference = ensureLiveReference.asInstanceOf[js.Any], ensureNoContext = ensureNoContext.asInstanceOf[js.Any], importPosition = importPosition.asInstanceOf[js.Any], importedInterop = importedInterop.asInstanceOf[js.Any], importedType = importedType.asInstanceOf[js.Any], importingInterop = importingInterop.asInstanceOf[js.Any], importedSource = null)
      __obj.asInstanceOf[ImportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockHoist(value: Double): Self = StObject.set(x, "blockHoist", value.asInstanceOf[js.Any])
      
      inline def setBlockHoistUndefined: Self = StObject.set(x, "blockHoist", js.undefined)
      
      inline def setEnsureLiveReference(value: Boolean): Self = StObject.set(x, "ensureLiveReference", value.asInstanceOf[js.Any])
      
      inline def setEnsureNoContext(value: Boolean): Self = StObject.set(x, "ensureNoContext", value.asInstanceOf[js.Any])
      
      inline def setImportPosition(value: before | after): Self = StObject.set(x, "importPosition", value.asInstanceOf[js.Any])
      
      inline def setImportedInterop(value: babel | node | compiled | uncompiled): Self = StObject.set(x, "importedInterop", value.asInstanceOf[js.Any])
      
      inline def setImportedSource(value: String): Self = StObject.set(x, "importedSource", value.asInstanceOf[js.Any])
      
      inline def setImportedSourceNull: Self = StObject.set(x, "importedSource", null)
      
      inline def setImportedType(value: es6 | commonjs): Self = StObject.set(x, "importedType", value.asInstanceOf[js.Any])
      
      inline def setImportingInterop(value: babel | node): Self = StObject.set(x, "importingInterop", value.asInstanceOf[js.Any])
      
      inline def setNameHint(value: String): Self = StObject.set(x, "nameHint", value.asInstanceOf[js.Any])
      
      inline def setNameHintUndefined: Self = StObject.set(x, "nameHint", js.undefined)
    }
  }
}
