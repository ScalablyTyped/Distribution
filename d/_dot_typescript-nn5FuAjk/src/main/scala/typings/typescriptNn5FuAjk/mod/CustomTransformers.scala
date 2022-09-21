package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTransformers extends StObject {
  
  /** Custom transformers to evaluate after built-in .js transformations. */
  var after: js.UndefOr[Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.undefined
  
  /** Custom transformers to evaluate after built-in .d.ts transformations. */
  var afterDeclarations: js.UndefOr[Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]] = js.undefined
  
  /** Custom transformers to evaluate before built-in .js transformations. */
  var before: js.UndefOr[Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.undefined
}
object CustomTransformers {
  
  inline def apply(): CustomTransformers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTransformers]
  }
  
  extension [Self <: CustomTransformers](x: Self) {
    
    inline def setAfter(value: Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarations(value: Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]): Self = StObject.set(x, "afterDeclarations", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarationsUndefined: Self = StObject.set(x, "afterDeclarations", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
