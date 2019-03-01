package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a map of input types to input instance or input index to input instance.
  */
trait CameraInputsMap[TCamera /* <: Camera */]
  extends /**
  * Accessor to the input by input type.
  */
/* name */ org.scalablytyped.runtime.StringDictionary[ICameraInput[TCamera]]
     with /**
  * Accessor to the input by input index.
  */
/* idx */ org.scalablytyped.runtime.NumberDictionary[ICameraInput[TCamera]]

object CameraInputsMap {
  @scala.inline
  def apply[TCamera /* <: Camera */](
    NumberDictionary: /**
    * Accessor to the input by input index.
    */
  /* idx */ org.scalablytyped.runtime.NumberDictionary[ICameraInput[TCamera]] = null,
    StringDictionary: /**
    * Accessor to the input by input type.
    */
  /* name */ org.scalablytyped.runtime.StringDictionary[ICameraInput[TCamera]] = null
  ): CameraInputsMap[TCamera] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CameraInputsMap[TCamera]]
  }
}

