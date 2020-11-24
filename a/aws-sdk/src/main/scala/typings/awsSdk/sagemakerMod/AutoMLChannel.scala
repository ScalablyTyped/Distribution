package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLChannel extends js.Object {
  
  /**
    * You can use Gzip or None. The default value is None.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.sagemakerMod.CompressionType] = js.native
  
  /**
    * The data source.
    */
  var DataSource: AutoMLDataSource = js.native
  
  /**
    * The name of the target variable in supervised learning, a.k.a. 'y'.
    */
  var TargetAttributeName: typings.awsSdk.sagemakerMod.TargetAttributeName = js.native
}
object AutoMLChannel {
  
  @scala.inline
  def apply(DataSource: AutoMLDataSource, TargetAttributeName: TargetAttributeName): AutoMLChannel = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLChannel]
  }
  
  @scala.inline
  implicit class AutoMLChannelOps[Self <: AutoMLChannel] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: AutoMLDataSource): Self = this.set("DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAttributeName(value: TargetAttributeName): Self = this.set("TargetAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionType(value: CompressionType): Self = this.set("CompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionType: Self = this.set("CompressionType", js.undefined)
  }
}
