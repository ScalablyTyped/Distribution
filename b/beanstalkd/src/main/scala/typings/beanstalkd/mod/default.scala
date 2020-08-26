package typings.beanstalkd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("beanstalkd", JSImport.Default)
@js.native
class default () extends BeanstalkdClient {
  def this(host: String) = this()
  def this(host: js.UndefOr[scala.Nothing], port: Double) = this()
  def this(host: String, port: Double) = this()
  def this(host: js.UndefOr[scala.Nothing], port: js.UndefOr[scala.Nothing], options: js.Object) = this()
  def this(host: js.UndefOr[scala.Nothing], port: Double, options: js.Object) = this()
  def this(host: String, port: js.UndefOr[scala.Nothing], options: js.Object) = this()
  def this(host: String, port: Double, options: js.Object) = this()
}

/* static members */
@JSImport("beanstalkd", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Prepare a command which will be applied on the Client.
    *
    * @param command The command to prepare.
    * @param expected The expected reply.
    */
  def addCommand(command: String, expected: String): Unit = js.native
  /**
    * Prepare a command which will be applied on the Client.
    *
    * @param command The command to prepare.
    * @param expected The expected reply.
    */
  def addYamlCommand(command: String, expected: String): Unit = js.native
}

