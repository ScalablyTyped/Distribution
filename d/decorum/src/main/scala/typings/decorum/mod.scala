package typings.decorum

import org.scalablytyped.runtime.StringDictionary
import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decorum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Alpha(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Alpha")().asInstanceOf[PropertyDecorator]
  inline def Alpha(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Alpha")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Alpha(message: MessageHandler[PatternValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Alpha")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def AlphaNumeric(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AlphaNumeric")().asInstanceOf[PropertyDecorator]
  inline def AlphaNumeric(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AlphaNumeric")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def AlphaNumeric(message: MessageHandler[PatternValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AlphaNumeric")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "BaseValidator")
  @js.native
  abstract class BaseValidator protected () extends StObject {
    /**
      * Initializes the {BaseValidator}
      * @param validatorKey A unique "key" by which to identify this field validator i.e. length, maxlength,
      *     required. Should be a valid JS property name.
      * @param message A custom error message to return. Should be passed down from concrete class' constructors to
      *     enable customizing error messages.
      */
    def this(validatorKey: String, message: String) = this()
    def this(validatorKey: String, message: MessageHandler[Any]) = this()
    
    /**
      * Gets the custom error message set on this validator.
      * @param opts Metadata about the field such as name and friendly name.
      * @returns {string} The custom error message or null if none has been set.
      */
    def getCustomMessage(opts: IMessageOpts): String = js.native
    
    /**
      * Gets the unique name for this validator.
      * @returns {string} The unique name for this validator.
      */
    def getKey(): String = js.native
    
    /**
      * [Abstract] Gets the error message to display when a field fails validation by this validator.
      * @param opts Metadata about the field such as name and friendly name.
      */
    def getMessage(opts: IMessageOpts): String = js.native
    
    /**
      * Returns true if the validator instance was passed a custom error message.
      */
    var hasCustomMessage: Boolean = js.native
    
    /**
      * [Abstract] Checks the passed value for validity.
      * @param value The field's proposed value.
      * @param model The rest of the model if cross-field validity checks are necessary.
      */
    def isValid(value: Any, model: Any): Boolean = js.native
    
    /**
      * Check whether this validator should process an "empty" value (i.e. null, undefined, empty string). Override
      * this in derived classes to skip validators if the field value hasn't been set. Things like email, min/max
      * length, and pattern should return false for this to ensure they don't get fired when the model is initially
      * empty before a user has had a chance to input a value. Things like required should override this to true so
      * that they are fired for empty values. Base implementation defaults to false
      * @returns {boolean}
      */
    def validatesEmptyValue(): Boolean = js.native
  }
  
  @JSImport("decorum", "CustomValidator")
  @js.native
  open class CustomValidator[TModel] protected () extends BaseValidator {
    def this(predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean], message: String) = this()
    def this(
      predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean],
      message: MessageHandler[CustomValidator[TModel]]
    ) = this()
  }
  
  inline def Email(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")().asInstanceOf[PropertyDecorator]
  inline def Email(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Email(message: MessageHandler[EmailValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "EmailValidator")
  @js.native
  open class EmailValidator () extends PatternValidator {
    def this(message: String) = this()
    def this(message: MessageHandler[EmailValidator]) = this()
  }
  /* static members */
  object EmailValidator {
    
    @JSImport("decorum", "EmailValidator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("decorum", "EmailValidator.EmailRegex")
    @js.native
    def EmailRegex: js.RegExp = js.native
    inline def EmailRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmailRegex")(x.asInstanceOf[js.Any])
  }
  
  inline def FieldName(name: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("FieldName")(name.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "FieldOptions")
  @js.native
  open class FieldOptions protected () extends StObject {
    def this(property: String) = this()
    
    /**
      * Add a validator to the list of validators for this field.
      * @param validator The validator to add. Should be a class that extends from {BaseValidator}.
      */
    def addValidator(validator: BaseValidator): Unit = js.native
    
    /**
      * Gets the "friendly" name of the field for use in validation error messages. Defaults to just "Field".
      * @returns {string}
      */
    def getFriendlyName(): String = js.native
    
    /**
      * Gets the validators assigned to this field.
      * @returns {BaseValidator[]} The validators for this field.
      */
    def getValidators(): js.Array[BaseValidator] = js.native
    
    /**
      * Sets the "friendly" name of the field for use in validation error messages. This name will be used in the
      * text of validation errors.
      * @param name The new name to set.
      */
    def setFriendlyName(name: String): Unit = js.native
    
    /**
      * Runs through all of the validators for the field given a particular value and returns any validation errors
      * that may have occurred.
      * @param value The value to validate.
      * @param model The rest of the model. Used in custom cross-field validations.
      * @returns {string[]} Any validation errors that may have occurred or an empty array if the value passed is
      *     valid for the field.
      */
    def validateValue(value: Any, model: Any): js.Array[String] = js.native
  }
  
  inline def Length(length: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Length")(length.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Length(length: Double, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Length(length: Double, message: MessageHandler[LengthValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "LengthValidator")
  @js.native
  open class LengthValidator protected () extends BaseValidator {
    def this(length: Double) = this()
    def this(length: Double, message: String) = this()
    def this(length: Double, message: MessageHandler[LengthValidator]) = this()
    
    def isValid(value: Any): Boolean = js.native
    
    var length: Double = js.native
  }
  
  inline def MaxLength(maxLength: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(maxLength.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxLength(maxLength: Double, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(maxLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def MaxLength(maxLength: Double, message: MessageHandler[MaxLengthValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(maxLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "MaxLengthValidator")
  @js.native
  open class MaxLengthValidator protected () extends BaseValidator {
    def this(maxLength: Double) = this()
    def this(maxLength: Double, message: String) = this()
    def this(maxLength: Double, message: MessageHandler[MaxLengthValidator]) = this()
    
    def isValid(value: String): Boolean = js.native
    
    var maxLength: Double = js.native
  }
  
  @JSImport("decorum", "MessageHandlers")
  @js.native
  def MessageHandlers: IMessageHandlerMap = js.native
  inline def MessageHandlers_=(x: IMessageHandlerMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageHandlers")(x.asInstanceOf[js.Any])
  
  inline def MinLength(minLength: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(minLength.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MinLength(minLength: Double, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(minLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def MinLength(minLength: Double, message: MessageHandler[MinLengthValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(minLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "MinLengthValidator")
  @js.native
  open class MinLengthValidator protected () extends BaseValidator {
    def this(minLength: Double) = this()
    def this(minLength: Double, message: String) = this()
    def this(minLength: Double, message: MessageHandler[MinLengthValidator]) = this()
    
    def isValid(value: String): Boolean = js.native
    
    var minLength: Double = js.native
  }
  
  @JSImport("decorum", "ModelValidator")
  @js.native
  open class ModelValidator protected () extends StObject {
    /**
      * Creates a new model validator.
      * @param model The model to validate. Should be a class that has a valid constructor function and prototype.
      */
    def this(model: Any) = this()
    
    /**
      * Gets the validation options for the given field name.
      * @param fieldKey         The name of the field to get options for.
      * @returns {FieldOptions} The field options associated with that field or null if no validations defined
      * for the field.
      */
    def getValidationOptions(fieldKey: String): FieldOptions = js.native
    
    /**
      * Validate the entire model and return a result that indicates whether the model is valid or not and any
      * errors
      * that have occurred in an object indexed by field name on the model.
      * @returns {IValidationResult} An object that contains whether the model is valid or not and errors by field
      *     name.
      */
    def validate(): IValidationResult = js.native
    
    /**
      * Validates the given field on this {ModelValidator}'s model. If a proposed value is passed, validate
      * against that passed value; otherwise, use the field's current value on the model.
      * @param fieldKey      The name of the field to validate.
      * @param proposedValue [Optional] The proposed value to set on the field.
      * @returns {string[]}  An array of field validation error messages if the field is invalid; otherwise,
      * an empty array.
      */
    def validateField(fieldKey: String): js.Array[String] = js.native
    def validateField(fieldKey: String, proposedValue: Any): js.Array[String] = js.native
  }
  
  inline def Pattern(regex: js.RegExp): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Pattern")(regex.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Pattern(regex: js.RegExp, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Pattern")(regex.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Pattern(regex: js.RegExp, message: MessageHandler[PatternValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Pattern")(regex.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "PatternValidator")
  @js.native
  open class PatternValidator protected () extends BaseValidator {
    def this(pattern: js.RegExp) = this()
    def this(pattern: js.RegExp, message: String) = this()
    def this(pattern: js.RegExp, message: MessageHandler[PatternValidator]) = this()
    
    def isValid(value: Any): Boolean = js.native
    
    var pattern: js.RegExp = js.native
  }
  
  inline def Required(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")().asInstanceOf[PropertyDecorator]
  inline def Required(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Required(message: MessageHandler[RequiredFieldValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "RequiredFieldValidator")
  @js.native
  open class RequiredFieldValidator () extends BaseValidator {
    def this(message: String) = this()
    def this(message: MessageHandler[RequiredFieldValidator]) = this()
    
    def isValid(value: Any): Boolean = js.native
  }
  
  inline def Validation[TModel](message: String, predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validation")(message.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validation[TModel](
    message: MessageHandler[CustomValidator[TModel]],
    predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean]
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validation")(message.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("decorum", "Validator")
  @js.native
  open class Validator () extends StObject
  /* static members */
  object Validator {
    
    @JSImport("decorum", "Validator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds a validator to the given object prototype for the given property. Meant to be used inside of validation
      * decorators to inject the validation onto the object property.
      * @param targetPrototype A valid object prototype to add to.
      * @param property The property to add the validator for.
      * @param validator The validator to add.
      */
    inline def addValidator(targetPrototype: js.Object, property: String, validator: BaseValidator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValidator")(targetPrototype.asInstanceOf[js.Any], property.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Decorates the passed class with model validations. Use this when you do not have access to ES7 decorators.
      * The object passed should be a valid class (ES6 class or ES5 function constructor).
      * @param objectType The class to decorate.
      * @param definitions One or more field validation definitions of the form { "fieldName": [ decorators ] }.
      */
    inline def decorate(objectType: Any, definitions: ValidationDefinitions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(objectType.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a new model validator for the given model. Model should be a valid class that has a valid constructor
      * and a prototype.
      * @param model The model to create the validator for.
      * @returns {ModelValidator} An instance of {ModelValidator}
      */
    inline def `new`(model: Any): ModelValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("new")(model.asInstanceOf[js.Any]).asInstanceOf[ModelValidator]
    
    /**
      * Creates an anonymous validator, immediately validates the model, and returns any validation errors on the
      * model as a result.
      * @param model The model to validate.
      */
    inline def validate(model: Any): IValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(model.asInstanceOf[js.Any]).asInstanceOf[IValidationResult]
  }
  
  trait IFieldValidationError extends StObject {
    
    /**
      * One or more field validation errors. Empty if no errors.
      */
    var errors: js.Array[String]
    
    /**
      * The property name of the field on the model.
      */
    var field: String
    
    /**
      * The "friendly" name of the field. If not set on the model via @FieldName(...), it will default to "Field".
      */
    var fieldName: String
  }
  object IFieldValidationError {
    
    inline def apply(errors: js.Array[String], field: String, fieldName: String): IFieldValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFieldValidationError]
    }
    
    extension [Self <: IFieldValidationError](x: Self) {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    }
  }
  
  type IMessageHandlerMap = StringDictionary[MessageHandler[Any]]
  
  trait IMessageOpts extends StObject {
    
    /**
      * The friendly name for the field. I.e. 'Email address', 'Password Confirmation', etc.
      */
    var friendlyName: String
    
    /**
      * The property name from the model. I.e. 'emailAddress', 'username', etc.
      */
    var property: String
    
    /**
      * The current value of the field at the time the validation error was generated.
      */
    var value: String
  }
  object IMessageOpts {
    
    inline def apply(friendlyName: String, property: String, value: String): IMessageOpts = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageOpts]
    }
    
    extension [Self <: IMessageOpts](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IValidationResult extends StObject {
    
    /**
      * A map of field name to validation errors.
      */
    var errors: js.Array[IFieldValidationError]
    
    /**
      * Whether or not the model is valid.
      */
    var isValid: Boolean
  }
  object IValidationResult {
    
    inline def apply(errors: js.Array[IFieldValidationError], isValid: Boolean): IValidationResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationResult]
    }
    
    extension [Self <: IValidationResult](x: Self) {
      
      inline def setErrors(value: js.Array[IFieldValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: IFieldValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageHandler[TValidator /* <: BaseValidator */] = js.Function2[/* opts */ IMessageOpts, /* validator */ TValidator, String]
  
  type ValidationDefinitions = StringDictionary[js.Array[PropertyDecorator]]
}
