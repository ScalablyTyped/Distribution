package typings.babelPluginEmberTemplateCompilation

import typings.babelPluginEmberTemplateCompilation.anon.Meta
import typings.babelPluginEmberTemplateCompilation.anon.NameHint
import typings.babelPluginEmberTemplateCompilation.anon.TypeofBabel
import typings.babelPluginEmberTemplateCompilation.anon.`0`
import typings.babelPluginEmberTemplateCompilation.srcScopeLocalsMod.ScopeLocals
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsUtilsMod {
  
  @JSImport("babel-plugin-ember-template-compilation/src/js-utils", "JSUtils")
  @js.native
  open class JSUtils protected () extends StObject {
    def this(
      babel: TypeofBabel,
      state: State,
      template: NodePath[typings.babelTypes.mod.Expression],
      scopeLocals: ScopeLocals,
      importer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
    ) = this()
    
    /**
      * Create a new binding that you can use in your template, initialized with
      * the given Javascript expression.
      *
      * @param { Expression } expression A javascript expression whose value will
      * initialize your new binding. See docs on the Expression type for details.
      * @param target The location within your template where the binding will be
      * used. This matters so we can avoid naming collisions.
      * @param opts.nameHint Optionally, provide a descriptive name for your new
      * binding. We will mangle this name as needed to avoid collisions, but
      * picking a good name here can aid in debugging.
      *
      * @return The name you can use in your template to access the binding.
      */
    def bindExpression(
      expression: Expression,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WalkerPath<ASTv1.Node> */ Any
    ): String = js.native
    def bindExpression(
      expression: Expression,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WalkerPath<ASTv1.Node> */ Any,
      opts: NameHint
    ): String = js.native
    
    /**
      * Gain access to an imported value within your template.
      *
      * @param moduleSpecifier The path to import from.
      * @param exportedName The named export you wish to access, or "default" for
      * the default export, or "*" for the namespace export.
      * @param target The location within your template where the binding will be
      * used. This matters so we can avoid naming collisions.
      * @param opts.nameHint Optionally, provide a descriptive name for your new
      * binding. We will mangle this name as needed to avoid collisions, but
      * picking a good name here can aid in debugging.
      *
      * @return The name you can use in your template to access the imported value.
      */
    def bindImport(
      moduleSpecifier: String,
      exportedName: String,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WalkerPath<ASTv1.Node> */ Any
    ): String = js.native
    def bindImport(
      moduleSpecifier: String,
      exportedName: String,
      target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WalkerPath<ASTv1.Node> */ Any,
      opts: NameHint
    ): String = js.native
    
    /**
      * Emit a javascript expresison for side-effect. This only accepts
      * expressions, not statements, because you should not introduce new bindings.
      * To introduce a binding see bindExpression or bindImport instead.
      *
      * @param { Expression } expression A javascript expression whose value will
      * initialize your new binding. See docs on the Expression type below for
      * details.
      */
    def emitExpression(expression: Expression): Unit = js.native
    
    /**
      * Add an import statement purely for side effect.
      *
      * @param moduleSpecifier the module to import
      */
    def importForSideEffect(moduleSpecifier: String): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  type Expression = String | (js.Function1[/* context */ ExpressionContext, String])
  
  /**
    * Allows you to construct an expression that relies on imported values.
    */
  @js.native
  trait ExpressionContext extends StObject {
    
    /**
      * Find or create a local binding for the given import.
      *
      * @param moduleSpecifier The path to import from.
      * @param exportedName The named export you wish to access, or "default" for
      * the default export, or "*" for the namespace export.
      * @param nameHint Optionally, provide a descriptive name for your new
      * binding. We will mangle this name as needed to avoid collisions, but
      * picking a good name here can aid in debugging.
      
      * @return the local identifier for the imported value
      */
    def `import`(moduleSpecifier: String, exportedName: String): String = js.native
    def `import`(moduleSpecifier: String, exportedName: String, nameHint: String): String = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  type ExtendedPluginBuilder = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ASTPluginBuilder<WithJSUtils<ASTPluginEnvironment>> */ Any
  
  trait State extends StObject {
    
    var lastInsertedPath: js.UndefOr[NodePath[Statement]] = js.undefined
    
    var program: NodePath[Program_]
  }
  object State {
    
    inline def apply(program: NodePath[Program_]): State = {
      val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setLastInsertedPath(value: NodePath[Statement]): Self = StObject.set(x, "lastInsertedPath", value.asInstanceOf[js.Any])
      
      inline def setLastInsertedPathUndefined: Self = StObject.set(x, "lastInsertedPath", js.undefined)
      
      inline def setProgram(value: NodePath[Program_]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    }
  }
  
  type WithJSUtils[T /* <: Meta */] = `0`[T] & T
}
