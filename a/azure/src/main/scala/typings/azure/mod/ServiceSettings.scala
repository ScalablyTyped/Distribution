package typings.azure.mod

import typings.node.urlMod.Url
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServiceSettings {
  
  @JSImport("azure", "ServiceSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("azure", "ServiceSettings.DEFAULT_PROTOCOL")
  @js.native
  def DEFAULT_PROTOCOL: String = js.native
  @scala.inline
  def DEFAULT_PROTOCOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PROTOCOL")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceSettings.NoMatchError")
  @js.native
  class NoMatchError () extends Error {
    def this(message: String) = this()
    def this(message: String, constr: js.Any) = this()
    
    var constr: js.Any = js.native
  }
  
  @JSImport("azure", "ServiceSettings.allRequired")
  @js.native
  def allRequired(args: js.Any*): ValidatorFunction = js.native
  
  @JSImport("azure", "ServiceSettings.atLeastOne")
  @js.native
  def atLeastOne(args: js.Any*): ValidatorFunction = js.native
  
  @JSImport("azure", "ServiceSettings.getValidator")
  @js.native
  def getValidator(requirements: Dictionary[Requirement], isRequired: Boolean, atLeastOne: Boolean): ValidatorFunction = js.native
  
  @JSImport("azure", "ServiceSettings.matchedSpecification")
  @js.native
  def matchedSpecification(settings: Dictionary[_]): Boolean = js.native
  
  @JSImport("azure", "ServiceSettings.noMatchConnectionString")
  @js.native
  def noMatchConnectionString(connectionString: String): Unit = js.native
  
  @JSImport("azure", "ServiceSettings.noMatchSettings")
  @js.native
  def noMatchSettings(settings: js.Any): Unit = js.native
  
  @JSImport("azure", "ServiceSettings.optional")
  @js.native
  def optional(args: js.Any*): ValidatorFunction = js.native
  
  @JSImport("azure", "ServiceSettings.parseAndValidateKeys")
  @js.native
  def parseAndValidateKeys(connectionString: String, validKeys: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("azure", "ServiceSettings.parseHost")
  @js.native
  def parseHost(uri: String): Url = js.native
  
  @JSImport("azure", "ServiceSettings.setting")
  @js.native
  def setting(name: String): js.Array[String] = js.native
  
  @JSImport("azure", "ServiceSettings.settingWithFunc")
  @js.native
  def settingWithFunc(name: String, predicate: js.Function): js.Array[Requirement] = js.native
}
