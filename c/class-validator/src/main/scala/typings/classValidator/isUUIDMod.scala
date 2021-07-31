package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUUIDMod {
  
  @JSImport("class-validator/types/decorator/string/IsUUID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "IS_UUID")
  @js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  
  @scala.inline
  def IsUUID_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")().asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsUUID_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsUUID_(version: UUIDVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  @scala.inline
  def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @scala.inline
  def isUUID(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isUUID(value: js.Any, version: UUIDVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
