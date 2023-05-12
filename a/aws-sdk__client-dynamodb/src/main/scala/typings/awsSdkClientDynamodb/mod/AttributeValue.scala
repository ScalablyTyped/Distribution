package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttributeValue {
  
  @JSImport("@aws-sdk/client-dynamodb", "AttributeValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def visit[T](value: typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue, visitor: Visitor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(value.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[T]
}
