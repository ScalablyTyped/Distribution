package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIPMod {
  
  @JSImport("class-validator/types/decorator/string/IsIP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIP", "IS_IP")
  @js.native
  val IS_IP: /* "isIp" */ String = js.native
  
  inline def IsIP_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")().asInstanceOf[PropertyDecorator]
  inline def IsIP_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsIP_(version: IsIpVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsIP_(version: IsIpVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isIP(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIP(value: js.Any, version: IsIpVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.classValidator.classValidatorNumbers.`4`
    - typings.classValidator.classValidatorNumbers.`6`
    - typings.classValidator.classValidatorStrings.`4`
    - typings.classValidator.classValidatorStrings.`6`
  */
  trait IsIpVersion extends StObject
  object IsIpVersion {
    
    inline def `4`: typings.classValidator.classValidatorNumbers.`4` = 4.asInstanceOf[typings.classValidator.classValidatorNumbers.`4`]
    
    inline def `6`: typings.classValidator.classValidatorNumbers.`6` = 6.asInstanceOf[typings.classValidator.classValidatorNumbers.`6`]
  }
}
