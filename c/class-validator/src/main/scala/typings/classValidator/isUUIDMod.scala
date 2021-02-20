package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUUIDMod {
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "IS_UUID")
  @js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(version: UUIDVersion): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "isUUID")
  @js.native
  def isUUID(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "isUUID")
  @js.native
  def isUUID(value: js.Any, version: UUIDVersion): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.classValidator.classValidatorNumbers.`3`
    - typings.classValidator.classValidatorNumbers.`4`
    - typings.classValidator.classValidatorNumbers.`5`
    - typings.classValidator.classValidatorStrings.`3`
    - typings.classValidator.classValidatorStrings.`4`
    - typings.classValidator.classValidatorStrings.`5`
    - typings.classValidator.classValidatorStrings.all
  */
  trait UUIDVersion extends StObject
  object UUIDVersion {
    
    @scala.inline
    def `3`: typings.classValidator.classValidatorNumbers.`3` = 3.asInstanceOf[typings.classValidator.classValidatorNumbers.`3`]
    
    @scala.inline
    def `4`: typings.classValidator.classValidatorNumbers.`4` = 4.asInstanceOf[typings.classValidator.classValidatorNumbers.`4`]
    
    @scala.inline
    def `5`: typings.classValidator.classValidatorNumbers.`5` = 5.asInstanceOf[typings.classValidator.classValidatorNumbers.`5`]
    
    @scala.inline
    def all: typings.classValidator.classValidatorStrings.all = "all".asInstanceOf[typings.classValidator.classValidatorStrings.all]
  }
}
