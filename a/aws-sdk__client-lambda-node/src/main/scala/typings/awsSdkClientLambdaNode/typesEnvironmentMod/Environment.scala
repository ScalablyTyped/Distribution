package typings.awsSdkClientLambdaNode.typesEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  var Variables: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
}

object Environment {
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
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
    def setVariables(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
  
}

