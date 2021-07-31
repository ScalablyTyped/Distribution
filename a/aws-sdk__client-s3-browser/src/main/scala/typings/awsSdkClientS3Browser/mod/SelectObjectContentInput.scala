package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.SQL
import typings.awsSdkClientS3Browser.typesInputSerializationMod.InputSerialization
import typings.awsSdkClientS3Browser.typesOutputSerializationMod.OutputSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectObjectContentInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
object SelectObjectContentInput {
  
  @scala.inline
  def apply(
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
