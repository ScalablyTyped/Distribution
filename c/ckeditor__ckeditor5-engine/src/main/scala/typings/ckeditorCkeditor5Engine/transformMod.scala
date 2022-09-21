package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Document
import typings.ckeditorCkeditor5Engine.anon.OperationsA
import typings.ckeditorCkeditor5Engine.operationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transform(a: Operation, b: Operation, context: TransformationContext): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def transformSets(operationsA: js.Array[Operation], operationsB: js.Array[Operation]): OperationsA = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSets")(operationsA.asInstanceOf[js.Any], operationsB.asInstanceOf[js.Any])).asInstanceOf[OperationsA]
  inline def transformSets(operationsA: js.Array[Operation], operationsB: js.Array[Operation], options: Document): OperationsA = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSets")(operationsA.asInstanceOf[js.Any], operationsB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OperationsA]
  
  trait TransformationContext extends StObject {
    
    var aIsStrong: Boolean
    
    var aWasUndone: Boolean
    
    var abRelation: String | Null
    
    var bWasUndone: Boolean
    
    var baRelation: String | Null
  }
  object TransformationContext {
    
    inline def apply(aIsStrong: Boolean, aWasUndone: Boolean, bWasUndone: Boolean): TransformationContext = {
      val __obj = js.Dynamic.literal(aIsStrong = aIsStrong.asInstanceOf[js.Any], aWasUndone = aWasUndone.asInstanceOf[js.Any], bWasUndone = bWasUndone.asInstanceOf[js.Any], abRelation = null, baRelation = null)
      __obj.asInstanceOf[TransformationContext]
    }
    
    extension [Self <: TransformationContext](x: Self) {
      
      inline def setAIsStrong(value: Boolean): Self = StObject.set(x, "aIsStrong", value.asInstanceOf[js.Any])
      
      inline def setAWasUndone(value: Boolean): Self = StObject.set(x, "aWasUndone", value.asInstanceOf[js.Any])
      
      inline def setAbRelation(value: String): Self = StObject.set(x, "abRelation", value.asInstanceOf[js.Any])
      
      inline def setAbRelationNull: Self = StObject.set(x, "abRelation", null)
      
      inline def setBWasUndone(value: Boolean): Self = StObject.set(x, "bWasUndone", value.asInstanceOf[js.Any])
      
      inline def setBaRelation(value: String): Self = StObject.set(x, "baRelation", value.asInstanceOf[js.Any])
      
      inline def setBaRelationNull: Self = StObject.set(x, "baRelation", null)
    }
  }
}
