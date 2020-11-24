package typings.classTransformer.classTransformOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetMap extends js.Object {
  
  /**
    * List of properties and their Types.
    */
  var properties: StringDictionary[js.Function] = js.native
  
  /**
    * Target which Types are being specified.
    */
  var target: js.Function = js.native
}
object TargetMap {
  
  @scala.inline
  def apply(properties: StringDictionary[js.Function], target: js.Function): TargetMap = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetMap]
  }
  
  @scala.inline
  implicit class TargetMapOps[Self <: TargetMap] (val x: Self) extends AnyVal {
    
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
    def setProperties(value: StringDictionary[js.Function]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
