package typings.decorum

import org.scalablytyped.runtime.StringDictionary
import typings.std.PropertyDecorator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decorum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("decorum", "Alpha")
  @js.native
  def Alpha(): PropertyDecorator = js.native
  @JSImport("decorum", "Alpha")
  @js.native
  def Alpha(message: String): PropertyDecorator = js.native
  @JSImport("decorum", "Alpha")
  @js.native
  def Alpha(message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "AlphaNumeric")
  @js.native
  def AlphaNumeric(): PropertyDecorator = js.native
  @JSImport("decorum", "AlphaNumeric")
  @js.native
  def AlphaNumeric(message: String): PropertyDecorator = js.native
  @JSImport("decorum", "AlphaNumeric")
  @js.native
  def AlphaNumeric(message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
  
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
    def this(validatorKey: String, message: MessageHandler[_]) = this()
    
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
    def isValid(value: js.Any, model: js.Any): Boolean = js.native
    
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
  class CustomValidator[TModel] protected () extends BaseValidator {
    def this(predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean], message: String) = this()
    def this(
      predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean],
      message: MessageHandler[CustomValidator[TModel]]
    ) = this()
  }
  
  @JSImport("decorum", "Email")
  @js.native
  def Email(): PropertyDecorator = js.native
  @JSImport("decorum", "Email")
  @js.native
  def Email(message: String): PropertyDecorator = js.native
  @JSImport("decorum", "Email")
  @js.native
  def Email(message: MessageHandler[EmailValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "EmailValidator")
  @js.native
  class EmailValidator () extends PatternValidator {
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
    def EmailRegex: RegExp = js.native
    @scala.inline
    def EmailRegex_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmailRegex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("decorum", "FieldName")
  @js.native
  def FieldName(name: String): PropertyDecorator = js.native
  
  @JSImport("decorum", "FieldOptions")
  @js.native
  class FieldOptions protected () extends StObject {
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
    def validateValue(value: js.Any, model: js.Any): js.Array[String] = js.native
  }
  
  @JSImport("decorum", "Length")
  @js.native
  def Length(length: Double): PropertyDecorator = js.native
  @JSImport("decorum", "Length")
  @js.native
  def Length(length: Double, message: String): PropertyDecorator = js.native
  @JSImport("decorum", "Length")
  @js.native
  def Length(length: Double, message: MessageHandler[LengthValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "LengthValidator")
  @js.native
  class LengthValidator protected () extends BaseValidator {
    def this(length: Double) = this()
    def this(length: Double, message: String) = this()
    def this(length: Double, message: MessageHandler[LengthValidator]) = this()
    
    def isValid(value: js.Any): Boolean = js.native
    
    var length: Double = js.native
  }
  
  @JSImport("decorum", "MaxLength")
  @js.native
  def MaxLength(maxLength: Double): PropertyDecorator = js.native
  @JSImport("decorum", "MaxLength")
  @js.native
  def MaxLength(maxLength: Double, message: String): PropertyDecorator = js.native
  @JSImport("decorum", "MaxLength")
  @js.native
  def MaxLength(maxLength: Double, message: MessageHandler[MaxLengthValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "MaxLengthValidator")
  @js.native
  class MaxLengthValidator protected () extends BaseValidator {
    def this(maxLength: Double) = this()
    def this(maxLength: Double, message: String) = this()
    def this(maxLength: Double, message: MessageHandler[MaxLengthValidator]) = this()
    
    def isValid(value: String): Boolean = js.native
    
    var maxLength: Double = js.native
  }
  
  @JSImport("decorum", "MessageHandlers")
  @js.native
  def MessageHandlers: IMessageHandlerMap = js.native
  @scala.inline
  def MessageHandlers_=(x: IMessageHandlerMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageHandlers")(x.asInstanceOf[js.Any])
  
  @JSImport("decorum", "MinLength")
  @js.native
  def MinLength(minLength: Double): PropertyDecorator = js.native
  @JSImport("decorum", "MinLength")
  @js.native
  def MinLength(minLength: Double, message: String): PropertyDecorator = js.native
  @JSImport("decorum", "MinLength")
  @js.native
  def MinLength(minLength: Double, message: MessageHandler[MinLengthValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "MinLengthValidator")
  @js.native
  class MinLengthValidator protected () extends BaseValidator {
    def this(minLength: Double) = this()
    def this(minLength: Double, message: String) = this()
    def this(minLength: Double, message: MessageHandler[MinLengthValidator]) = this()
    
    def isValid(value: String): Boolean = js.native
    
    var minLength: Double = js.native
  }
  
  @JSImport("decorum", "ModelValidator")
  @js.native
  class ModelValidator protected () extends StObject {
    /**
      * Creates a new model validator.
      * @param model The model to validate. Should be a class that has a valid constructor function and prototype.
      */
    def this(model: js.Any) = this()
    
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
    def validateField(fieldKey: String, proposedValue: js.Any): js.Array[String] = js.native
  }
  
  @JSImport("decorum", "Pattern")
  @js.native
  def Pattern(regex: RegExp): PropertyDecorator = js.native
  @JSImport("decorum", "Pattern")
  @js.native
  def Pattern(regex: RegExp, message: String): PropertyDecorator = js.native
  @JSImport("decorum", "Pattern")
  @js.native
  def Pattern(regex: RegExp, message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "PatternValidator")
  @js.native
  class PatternValidator protected () extends BaseValidator {
    def this(pattern: RegExp) = this()
    def this(pattern: RegExp, message: String) = this()
    def this(pattern: RegExp, message: MessageHandler[PatternValidator]) = this()
    
    def isValid(value: js.Any): Boolean = js.native
    
    var pattern: RegExp = js.native
  }
  
  @JSImport("decorum", "Required")
  @js.native
  def Required(): PropertyDecorator = js.native
  @JSImport("decorum", "Required")
  @js.native
  def Required(message: String): PropertyDecorator = js.native
  @JSImport("decorum", "Required")
  @js.native
  def Required(message: MessageHandler[RequiredFieldValidator]): PropertyDecorator = js.native
  
  @JSImport("decorum", "RequiredFieldValidator")
  @js.native
  class RequiredFieldValidator () extends BaseValidator {
    def this(message: String) = this()
    def this(message: MessageHandler[RequiredFieldValidator]) = this()
    
    def isValid(value: js.Any): Boolean = js.native
  }
  
  @JSImport("decorum", "Validation")
  @js.native
  def Validation[TModel](message: String, predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean]): PropertyDecorator = js.native
  @JSImport("decorum", "Validation")
  @js.native
  def Validation[TModel](
    message: MessageHandler[CustomValidator[TModel]],
    predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean]
  ): PropertyDecorator = js.native
  
  @JSImport("decorum", "Validator")
  @js.native
  class Validator () extends StObject
  /* static members */
  object Validator {
    
    /**
      * Adds a validator to the given object prototype for the given property. Meant to be used inside of validation
      * decorators to inject the validation onto the object property.
      * @param targetPrototype A valid object prototype to add to.
      * @param property The property to add the validator for.
      * @param validator The validator to add.
      */
    @JSImport("decorum", "Validator.addValidator")
    @js.native
    def addValidator(targetPrototype: js.Object, property: String, validator: BaseValidator): Unit = js.native
    
    /**
      * Decorates the passed class with model validations. Use this when you do not have access to ES7 decorators.
      * The object passed should be a valid class (ES6 class or ES5 function constructor).
      * @param objectType The class to decorate.
      * @param definitions One or more field validation definitions of the form { "fieldName": [ decorators ] }.
      */
    @JSImport("decorum", "Validator.decorate")
    @js.native
    def decorate(objectType: js.Any, definitions: ValidationDefinitions): Unit = js.native
    
    /**
      * Creates an anonymous validator, immediately validates the model, and returns any validation errors on the
      * model as a result.
      * @param model The model to validate.
      */
    @JSImport("decorum", "Validator.validate")
    @js.native
    def validate(model: js.Any): IValidationResult = js.native
    
    /**
      * Creates a new model validator for the given model. Model should be a valid class that has a valid constructor
      * and a prototype.
      * @param model The model to create the validator for.
      * @returns {ModelValidator} An instance of {ModelValidator}
      */
    @JSImport("decorum", "Validator.new")
    @js.native
    def `new`(model: js.Any): ModelValidator = js.native
  }
  
  @js.native
  trait IFieldValidationError extends StObject {
    
    /**
      * One or more field validation errors. Empty if no errors.
      */
    var errors: js.Array[String] = js.native
    
    /**
      * The property name of the field on the model.
      */
    var field: String = js.native
    
    /**
      * The "friendly" name of the field. If not set on the model via @FieldName(...), it will default to "Field".
      */
    var fieldName: String = js.native
  }
  object IFieldValidationError {
    
    @scala.inline
    def apply(errors: js.Array[String], field: String, fieldName: String): IFieldValidationError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFieldValidationError]
    }
    
    @scala.inline
    implicit class IFieldValidationErrorMutableBuilder[Self <: IFieldValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    }
  }
  
  type IMessageHandlerMap = StringDictionary[MessageHandler[js.Any]]
  
  @js.native
  trait IMessageOpts extends StObject {
    
    /**
      * The friendly name for the field. I.e. 'Email address', 'Password Confirmation', etc.
      */
    var friendlyName: String = js.native
    
    /**
      * The property name from the model. I.e. 'emailAddress', 'username', etc.
      */
    var property: String = js.native
    
    /**
      * The current value of the field at the time the validation error was generated.
      */
    var value: String = js.native
  }
  object IMessageOpts {
    
    @scala.inline
    def apply(friendlyName: String, property: String, value: String): IMessageOpts = {
      val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageOpts]
    }
    
    @scala.inline
    implicit class IMessageOptsMutableBuilder[Self <: IMessageOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IValidationResult extends StObject {
    
    /**
      * A map of field name to validation errors.
      */
    var errors: js.Array[IFieldValidationError] = js.native
    
    /**
      * Whether or not the model is valid.
      */
    var isValid: Boolean = js.native
  }
  object IValidationResult {
    
    @scala.inline
    def apply(errors: js.Array[IFieldValidationError], isValid: Boolean): IValidationResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidationResult]
    }
    
    @scala.inline
    implicit class IValidationResultMutableBuilder[Self <: IValidationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[IFieldValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: IFieldValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageHandler[TValidator /* <: BaseValidator */] = js.Function2[/* opts */ IMessageOpts, /* validator */ TValidator, String]
  
  type ValidationDefinitions = StringDictionary[js.Array[PropertyDecorator]]
}
