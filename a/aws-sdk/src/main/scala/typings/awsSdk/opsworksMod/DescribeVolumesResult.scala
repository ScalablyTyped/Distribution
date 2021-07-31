package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesResult extends StObject {
  
  /**
    * An array of volume IDs.
    */
  var Volumes: js.UndefOr[typings.awsSdk.opsworksMod.Volumes] = js.undefined
}
object DescribeVolumesResult {
  
  @scala.inline
  def apply(): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesResult]
  }
  
  @scala.inline
  implicit class DescribeVolumesResultMutableBuilder[Self <: DescribeVolumesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumes(value: Volumes): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = StObject.set(x, "Volumes", js.Array(value :_*))
  }
}
