package typings.classTransformer.classTransformOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetMap extends js.Object {
  /**
    * List of properties and their Types.
    */
  var properties: StringDictionary[js.Function]
  /**
    * Target which Types are being specified.
    */
  var target: js.Function
}

object TargetMap {
  @scala.inline
  def apply(properties: StringDictionary[js.Function], target: js.Function): TargetMap = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TargetMap]
  }
}

