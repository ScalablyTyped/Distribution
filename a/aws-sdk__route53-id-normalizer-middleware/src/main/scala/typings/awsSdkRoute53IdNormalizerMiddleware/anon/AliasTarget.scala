package typings.awsSdkRoute53IdNormalizerMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasTarget extends js.Object {
  
  var AliasTarget: js.UndefOr[HostedZoneId] = js.native
}
object AliasTarget {
  
  @scala.inline
  def apply(): AliasTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasTarget]
  }
  
  @scala.inline
  implicit class AliasTargetOps[Self <: AliasTarget] (val x: Self) extends AnyVal {
    
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
    def setAliasTarget(value: HostedZoneId): Self = this.set("AliasTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasTarget: Self = this.set("AliasTarget", js.undefined)
  }
}
