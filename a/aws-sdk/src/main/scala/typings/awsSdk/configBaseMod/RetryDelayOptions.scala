package typings.awsSdk.configBaseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryDelayOptions extends js.Object {
  
  /**
    * The base number of milliseconds to use in the exponential backoff for operation retries.
    * Defaults to 100 ms.
    */
  var base: js.UndefOr[Double] = js.native
  
  /**
    * A custom function that accepts a retry count and error and returns the amount of time to delay in milliseconds. If the result is a non-zero negative value, no further retry attempts will be made.
    * The base option will be ignored if this option is supplied.
    */
  var customBackoff: js.UndefOr[js.Function2[/* retryCount */ Double, /* err */ js.UndefOr[Error], Double]] = js.native
}
object RetryDelayOptions {
  
  @scala.inline
  def apply(): RetryDelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryDelayOptions]
  }
  
  @scala.inline
  implicit class RetryDelayOptionsOps[Self <: RetryDelayOptions] (val x: Self) extends AnyVal {
    
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
    def setBase(value: Double): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setCustomBackoff(value: (/* retryCount */ Double, /* err */ js.UndefOr[Error]) => Double): Self = this.set("customBackoff", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCustomBackoff: Self = this.set("customBackoff", js.undefined)
  }
}
