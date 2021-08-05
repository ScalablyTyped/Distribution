package typings.azure.mod

import typings.node.urlMod.Url
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ServiceSettings {
  
  @JSImport("azure", "ServiceSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("azure", "ServiceSettings.DEFAULT_PROTOCOL")
  @js.native
  def DEFAULT_PROTOCOL: String = js.native
  inline def DEFAULT_PROTOCOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_PROTOCOL")(x.asInstanceOf[js.Any])
  
  @JSImport("azure", "ServiceSettings.NoMatchError")
  @js.native
  class NoMatchError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, constr: js.Any) = this()
    
    var constr: js.Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def allRequired(args: js.Any*): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("allRequired")(args.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
  
  inline def atLeastOne(args: js.Any*): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("atLeastOne")(args.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
  
  inline def getValidator(requirements: Dictionary[Requirement], isRequired: Boolean, atLeastOne: Boolean): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(requirements.asInstanceOf[js.Any], isRequired.asInstanceOf[js.Any], atLeastOne.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
  
  inline def matchedSpecification(settings: Dictionary[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchedSpecification")(settings.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noMatchConnectionString(connectionString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noMatchConnectionString")(connectionString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def noMatchSettings(settings: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noMatchSettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def optional(args: js.Any*): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(args.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
  
  inline def parseAndValidateKeys(connectionString: String, validKeys: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAndValidateKeys")(connectionString.asInstanceOf[js.Any], validKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def parseHost(uri: String): Url = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(uri.asInstanceOf[js.Any]).asInstanceOf[Url]
  
  inline def setting(name: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setting")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def settingWithFunc(name: String, predicate: js.Function): js.Array[Requirement] = (^.asInstanceOf[js.Dynamic].applyDynamic("settingWithFunc")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Requirement]]
}
