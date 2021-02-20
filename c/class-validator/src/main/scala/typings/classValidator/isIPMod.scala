package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIPMod {
  
  @JSImport("class-validator/types/decorator/string/IsIP", "IS_IP")
  @js.native
  val IS_IP: /* "isIp" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(version: IsIpVersion): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(version: IsIpVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIP", "isIP")
  @js.native
  def isIP(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "isIP")
  @js.native
  def isIP(value: js.Any, version: IsIpVersion): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.classValidator.classValidatorNumbers.`4`
    - typings.classValidator.classValidatorNumbers.`6`
    - typings.classValidator.classValidatorStrings.`4`
    - typings.classValidator.classValidatorStrings.`6`
  */
  trait IsIpVersion extends StObject
  object IsIpVersion {
    
    @scala.inline
    def `4`: typings.classValidator.classValidatorNumbers.`4` = 4.asInstanceOf[typings.classValidator.classValidatorNumbers.`4`]
    
    @scala.inline
    def `6`: typings.classValidator.classValidatorNumbers.`6` = 6.asInstanceOf[typings.classValidator.classValidatorNumbers.`6`]
  }
}
