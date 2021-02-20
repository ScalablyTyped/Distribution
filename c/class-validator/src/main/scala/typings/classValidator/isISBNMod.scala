package typings.classValidator

import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isISBNMod {
  
  @JSImport("class-validator/types/decorator/string/IsISBN", "IS_ISBN")
  @js.native
  val IS_ISBN: /* "isIsbn" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISBN", "IsISBN")
  @js.native
  def IsISBN_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsISBN", "IsISBN")
  @js.native
  def IsISBN_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsISBN", "IsISBN")
  @js.native
  def IsISBN_(version: IsISBNVersion): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsISBN", "IsISBN")
  @js.native
  def IsISBN_(version: IsISBNVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsISBN", "isISBN")
  @js.native
  def isISBN(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsISBN", "isISBN")
  @js.native
  def isISBN(value: js.Any, version: IsISBNVersion): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.classValidator.classValidatorNumbers.`10`
    - typings.classValidator.classValidatorNumbers.`13`
    - typings.classValidator.classValidatorStrings.`10`
    - typings.classValidator.classValidatorStrings.`13`
  */
  trait IsISBNVersion extends StObject
  object IsISBNVersion {
    
    @scala.inline
    def `10`: typings.classValidator.classValidatorNumbers.`10` = 10.asInstanceOf[typings.classValidator.classValidatorNumbers.`10`]
    
    @scala.inline
    def `13`: typings.classValidator.classValidatorNumbers.`13` = 13.asInstanceOf[typings.classValidator.classValidatorNumbers.`13`]
  }
}
