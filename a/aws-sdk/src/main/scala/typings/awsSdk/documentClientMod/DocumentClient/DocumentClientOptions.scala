package typings.awsSdk.documentClientMod.DocumentClient

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.dynamodbMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentClientOptions extends ConverterOptions {
  
  /**
    * An optional map of parameters to bind to every request sent by this service object.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * An optional pre-configured instance of the AWS.DynamoDB service object to use for requests. The object may bound parameters used by the document client.
    */
  var service: js.UndefOr[^] = js.native
}
object DocumentClientOptions {
  
  @scala.inline
  def apply(): DocumentClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClientOptions]
  }
  
  @scala.inline
  implicit class DocumentClientOptionsOps[Self <: DocumentClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setService(value: ^): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
