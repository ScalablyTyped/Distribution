package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "ServiceSettings")
@js.native
object ServiceSettingsNs extends js.Object {
  @js.native
  class NoMatchError ()
    extends stdLib.Error {
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, constr: js.Any) = this()
    var constr: js.Any = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  var DEFAULT_PROTOCOL: java.lang.String = js.native
  def allRequired(args: js.Any*): azureLib.azureMod.ValidatorFunction = js.native
  def atLeastOne(args: js.Any*): azureLib.azureMod.ValidatorFunction = js.native
  def getValidator(
    requirements: azureLib.azureMod.Dictionary[azureLib.azureMod.Requirement],
    isRequired: scala.Boolean,
    atLeastOne: scala.Boolean
  ): azureLib.azureMod.ValidatorFunction = js.native
  def matchedSpecification(settings: azureLib.azureMod.Dictionary[_]): scala.Boolean = js.native
  def noMatchConnectionString(connectionString: java.lang.String): scala.Unit = js.native
  def noMatchSettings(settings: js.Any): scala.Unit = js.native
  def optional(args: js.Any*): azureLib.azureMod.ValidatorFunction = js.native
  def parseAndValidateKeys(connectionString: java.lang.String, validKeys: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def parseHost(uri: java.lang.String): nodeLib.urlMod.Url = js.native
  def setting(name: java.lang.String): js.Array[java.lang.String] = js.native
  def settingWithFunc(name: java.lang.String, predicate: js.Function): js.Array[azureLib.azureMod.Requirement] = js.native
}

