package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typings.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectObjectContentInput
  extends StObject
     with typings.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
object SelectObjectContentInput {
  
  inline def apply(
    Bucket: String,
    Expression: String,
    ExpressionType: SQL | String,
    InputSerialization: InputSerialization,
    Key: String,
    OutputSerialization: OutputSerialization
  ): SelectObjectContentInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentInput]
  }
}
