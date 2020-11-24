package typings.awsSdkSmithyClient.exceptionMod

import typings.awsSdkSmithyClient.awsSdkSmithyClientStrings.client
import typings.awsSdkSmithyClient.awsSdkSmithyClientStrings.server
import typings.awsSdkSmithyClient.retryableTraitMod.RetryableTrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmithyException extends js.Object {
  
  /**
    * Whether the client or server are at fault.
    */
  @JSName("$fault")
  val $fault: client | server = js.native
  
  /**
    * Indicates that an error MAY be retried by the client.
    */
  @JSName("$retryable")
  val $retryable: js.UndefOr[RetryableTrait] = js.native
  
  /**
    * The service that encountered the exception.
    */
  @JSName("$service")
  val $service: js.UndefOr[String] = js.native
  
  /**
    * The shape ID name of the exception.
    */
  val name: String = js.native
}
object SmithyException {
  
  @scala.inline
  def apply($fault: client | server, name: String): SmithyException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmithyException]
  }
  
  @scala.inline
  implicit class SmithyExceptionOps[Self <: SmithyException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$fault(value: client | server): Self = this.set("$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$retryable(value: RetryableTrait): Self = this.set("$retryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$retryable: Self = this.set("$retryable", js.undefined)
    
    @scala.inline
    def set$service(value: String): Self = this.set("$service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$service: Self = this.set("$service", js.undefined)
  }
}
