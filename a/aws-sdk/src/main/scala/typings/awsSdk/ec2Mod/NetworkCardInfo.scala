package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkCardInfo extends js.Object {
  
  /**
    * The maximum number of network interfaces for the network card.
    */
  var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces] = js.native
  
  /**
    * The index of the network card.
    */
  var NetworkCardIndex: js.UndefOr[typings.awsSdk.ec2Mod.NetworkCardIndex] = js.native
  
  /**
    * The network performance of the network card.
    */
  var NetworkPerformance: js.UndefOr[typings.awsSdk.ec2Mod.NetworkPerformance] = js.native
}
object NetworkCardInfo {
  
  @scala.inline
  def apply(): NetworkCardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkCardInfo]
  }
  
  @scala.inline
  implicit class NetworkCardInfoOps[Self <: NetworkCardInfo] (val x: Self) extends AnyVal {
    
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
    def setMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = this.set("MaximumNetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumNetworkInterfaces: Self = this.set("MaximumNetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkCardIndex(value: NetworkCardIndex): Self = this.set("NetworkCardIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkCardIndex: Self = this.set("NetworkCardIndex", js.undefined)
    
    @scala.inline
    def setNetworkPerformance(value: NetworkPerformance): Self = this.set("NetworkPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPerformance: Self = this.set("NetworkPerformance", js.undefined)
  }
}
