package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  /**
    * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[typings.awsSdk.s3Mod.HttpErrorCodeReturnedEquals] = js.native
  
  /**
    * The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.
    */
  var KeyPrefixEquals: js.UndefOr[typings.awsSdk.s3Mod.KeyPrefixEquals] = js.native
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
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
    def setHttpErrorCodeReturnedEquals(value: HttpErrorCodeReturnedEquals): Self = this.set("HttpErrorCodeReturnedEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpErrorCodeReturnedEquals: Self = this.set("HttpErrorCodeReturnedEquals", js.undefined)
    
    @scala.inline
    def setKeyPrefixEquals(value: KeyPrefixEquals): Self = this.set("KeyPrefixEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefixEquals: Self = this.set("KeyPrefixEquals", js.undefined)
  }
}
