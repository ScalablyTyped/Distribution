package typings.bunyan.bunyanMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdSerializers extends Serializers {
  @JSName("err")
  var err_Original: Serializer = js.native
  @JSName("req")
  var req_Original: Serializer = js.native
  @JSName("res")
  var res_Original: Serializer = js.native
  def err(input: js.Any): js.Any = js.native
  def req(input: js.Any): js.Any = js.native
  def res(input: js.Any): js.Any = js.native
}

@JSImport("bunyan", "stdSerializers")
@js.native
object stdSerializers extends TopLevel[StdSerializers]

