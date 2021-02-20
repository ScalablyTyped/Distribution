package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLChannel extends StObject {
  
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
  implicit class AutoMLChannelMutableBuilder[Self <: AutoMLChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    @scala.inline
    def setDataSource(value: AutoMLDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAttributeName(value: TargetAttributeName): Self = StObject.set(x, "TargetAttributeName", value.asInstanceOf[js.Any])
  }
}
