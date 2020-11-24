package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataflowEndpointConfig extends js.Object {
  
  /**
    * Name of a dataflow endpoint.
    */
  var dataflowEndpointName: String = js.native
  
  /**
    * Region of a dataflow endpoint.
    */
  var dataflowEndpointRegion: js.UndefOr[String] = js.native
}
object DataflowEndpointConfig {
  
  @scala.inline
  def apply(dataflowEndpointName: String): DataflowEndpointConfig = {
    val __obj = js.Dynamic.literal(dataflowEndpointName = dataflowEndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataflowEndpointConfig]
  }
  
  @scala.inline
  implicit class DataflowEndpointConfigOps[Self <: DataflowEndpointConfig] (val x: Self) extends AnyVal {
    
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
    def setDataflowEndpointName(value: String): Self = this.set("dataflowEndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEndpointRegion(value: String): Self = this.set("dataflowEndpointRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataflowEndpointRegion: Self = this.set("dataflowEndpointRegion", js.undefined)
  }
}
