package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorParameter extends js.Object {
  /**
    * The name of the parameter.
    */
  var ParameterName: ProcessorParameterName = js.native
  /**
    * The parameter value.
    */
  var ParameterValue: ProcessorParameterValue = js.native
}

object ProcessorParameter {
  @scala.inline
  def apply(ParameterName: ProcessorParameterName, ParameterValue: ProcessorParameterValue): ProcessorParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessorParameter]
  }
}

