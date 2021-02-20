package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContainerInput extends StObject {
  
  /**
    * The name of the container to query.
    */
  var ContainerName: js.UndefOr[typings.awsSdk.mediastoreMod.ContainerName] = js.native
}
object DescribeContainerInput {
  
  @scala.inline
  def apply(): DescribeContainerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerInput]
  }
  
  @scala.inline
  implicit class DescribeContainerInputMutableBuilder[Self <: DescribeContainerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "ContainerName", js.undefined)
  }
}
