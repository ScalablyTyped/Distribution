package typings.sucraseTbLAtQ5t

import typings.sucraseTbLAtQ5t.getClassInfoDTsMod.ClassInfo
import typings.sucraseTbLAtQ5t.mod.Options
import typings.sucraseTbLAtQ5t.mod.SucraseContext
import typings.sucraseTbLAtQ5t.mod.Transform_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootTransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/RootTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RootTransformer {
    def this(
      sucraseContext: SucraseContext,
      transforms: js.Array[Transform_],
      enableLegacyBabel5ModuleInterop: Boolean,
      options: Options
    ) = this()
  }
  
  @js.native
  trait RootTransformer extends StObject {
    
    /* private */ var disableESTransforms: Any = js.native
    
    /* private */ var generatedVariables: Any = js.native
    
    /* private */ var helperManager: Any = js.native
    
    /* private */ var isImportsTransformEnabled: Any = js.native
    
    /* private */ var isReactHotLoaderTransformEnabled: Any = js.native
    
    def makeConstructorInitCode(
      constructorInitializerStatements: js.Array[String],
      instanceInitializerNames: js.Array[String],
      className: String
    ): String = js.native
    
    /* private */ var nameManager: Any = js.native
    
    def processBalancedCode(): Unit = js.native
    
    def processClass(): Unit = js.native
    
    /**
      * We want to just handle class fields in all contexts, since TypeScript supports them. Later,
      * when some JS implementations support class fields, this should be made optional.
      */
    def processClassBody(classInfo: ClassInfo): Unit = js.native
    def processClassBody(classInfo: ClassInfo, className: String): Unit = js.native
    
    /**
      * Skip past a class with a name and return that name.
      */
    def processNamedClass(): String = js.native
    
    /**
      * Normally it's ok to simply remove type tokens, but we need to be more careful when dealing with
      * arrow function return types since they can confuse the parser. In that case, we want to move
      * the close-paren to the same line as the arrow.
      *
      * See https://github.com/alangpierce/sucrase/issues/391 for more details.
      */
    def processPossibleArrowParamEnd(): Boolean = js.native
    
    /**
      * An async arrow function might be of the form:
      *
      * async <
      *   T
      * >() => {}
      *
      * in which case, removing the type parameters will cause a syntax error. Detect this case and
      * move the open-paren earlier.
      */
    def processPossibleAsyncArrowWithTypeParams(): Boolean = js.native
    
    def processPossibleTypeRange(): Boolean = js.native
    
    def processToken(): Unit = js.native
    
    /* private */ var tokens: Any = js.native
    
    def transform(): String = js.native
    
    /* private */ var transformers: Any = js.native
  }
}
