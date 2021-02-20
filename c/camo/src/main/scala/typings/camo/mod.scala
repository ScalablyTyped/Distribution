package typings.camo

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBufferConstructor
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.Date
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExp
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camo", "Document")
  @js.native
  class Document[Schema /* <: DocumentSchema */] ()
    extends /**
    * Index signature
    */
  /* property */ StringDictionary[SchemaTypeExtended | String | Document[_] | js.Function] {
    
    /**
      * Removes documents from the database.
      * Should only be used on an instantiated document with a valid id.
      *
      * @returns {Promise<number>} Number of deleted documents.
      */
    def delete(): js.Promise[Double] = js.native
    
    /**
      * post-delete hook.
      *
      * @protected
      * @returns {Promise<any>}
      */
    /* protected */ def postDelete(): js.Promise[_] = js.native
    
    /**
      * post-save hook.
      *
      * @protected
      * @returns {Promise<any>}
      */
    /* protected */ def postSave(): js.Promise[_] = js.native
    
    /**
      * post-validate hook.
      *
      * @protected
      * @returns {Promise<any>}
      */
    /* protected */ def postValidate(): js.Promise[_] = js.native
    
    /**
      * pre-delete hook.
      *
      * @protected
      * @returns {Promise<any>}
      */
    /* protected */ def preDelete(): js.Promise[_] = js.native
    
    /**
      * pre-save hook.
      *
      * @protected
      * @returns {Promise<any>}
      */
    /* protected */ def preSave(): js.Promise[_] = js.native
    
    /**
      * pre-validate hook.
      *
      * @protected
      * @returns {Promise<any>}
      */
    /* protected */ def preValidate(): js.Promise[_] = js.native
    
    /**
      * Saves the document instance to the database.
      *
      * @returns {Promise<Schema>}
      */
    def save(): js.Promise[Schema] = js.native
    
    /**
      * Sets the schema (to be used on the constructor).
      *
      * @protected
      * @template Schema
      * @param {Schema} schema
      */
    /* protected */ def schema[Schema](schema: Schema): Unit = js.native
    
    /**
      * Serialized document to just the data, which includes nested and referenced data.
      *
      * @returns {*}
      */
    def toJSON(): js.Any = js.native
  }
  /* static members */
  object Document {
    
    /**
      * Static method to define the collection name.
      *
      * @protected
      * @static
      * @returns {string} The collection name.
      */
    @JSImport("camo", "Document.collectionName")
    @js.native
    def collectionName(): String = js.native
    
    /**
      * Number of matching documents without retrieving all the data.
      *
      * @static
      * @param {*} query Count query.
      * @returns {Promise<number>}
      */
    @JSImport("camo", "Document.count")
    @js.native
    def count(query: js.Any): js.Promise[Double] = js.native
    
    /**
      * Creates a camo document instance.
      *
      * @static
      * @template StaticSchema
      * @param {StaticSchema} schema Base schema to create a document.
      * @returns {DocumentInstance<StaticSchema>} A camo document instance.
      */
    @JSImport("camo", "Document.create")
    @js.native
    def create[StaticSchema /* <: DocumentSchema */](schema: StaticSchema): Document[StaticSchema] = js.native
    
    /**
      * Removes all documents matching the query.
      *
      * @static
      * @param {*} query Delete query.
      * @returns {Promise<number>} Number of deleted documents.
      */
    @JSImport("camo", "Document.deleteMany")
    @js.native
    def deleteMany(query: js.Any): js.Promise[Double] = js.native
    
    /**
      * Removes the first document found, even if multiple documents match the query.
      *
      * @static
      * @param {*} query Delete query.
      * @returns {Promise<number>} Number of deleted documents.
      */
    @JSImport("camo", "Document.deleteOne")
    @js.native
    def deleteOne(query: js.Any): js.Promise[Double] = js.native
    
    /**
      * Return all documents matching the query.
      *
      * @static
      * @template StaticSchema
      * @param {*} query Find query.
      * @param {FindOptions} options
      * @returns {Promise<StaticSchema>}
      */
    @JSImport("camo", "Document.find")
    @js.native
    def find[StaticSchema /* <: DocumentSchema */](query: js.Any): js.Promise[js.Array[StaticSchema]] = js.native
    @JSImport("camo", "Document.find")
    @js.native
    def find[StaticSchema /* <: DocumentSchema */](query: js.Any, options: FindOptions): js.Promise[js.Array[StaticSchema]] = js.native
    
    /**
      * Return the first document found, even if multiple documents match the query.
      *
      * @static
      * @template StaticSchema
      * @param {*} query Find query.
      * @param {FindOneOptions} options findOne method options.
      * @returns {Promise<StaticSchema>}
      */
    @JSImport("camo", "Document.findOne")
    @js.native
    def findOne[StaticSchema /* <: DocumentSchema */](query: js.Any): js.Promise[StaticSchema] = js.native
    @JSImport("camo", "Document.findOne")
    @js.native
    def findOne[StaticSchema /* <: DocumentSchema */](query: js.Any, options: FindOneOptions): js.Promise[StaticSchema] = js.native
    
    /**
      * Find the first document and delete it.
      *
      * @static
      * @param {*} query Delete query.
      * @param {*} options Database Options for findOneAndDelete method.
      * @returns {Promise<number>} Number of deleted documents.
      */
    @JSImport("camo", "Document.findOneAndDelete")
    @js.native
    def findOneAndDelete(query: js.Any): js.Promise[Double] = js.native
    @JSImport("camo", "Document.findOneAndDelete")
    @js.native
    def findOneAndDelete(query: js.Any, options: js.Any): js.Promise[Double] = js.native
    
    /**
      * Find and update (or insert) a document in one atomic operation (atomic for MongoDB only).
      *
      * @static
      * @template StaticSchema
      * @param {*} query Find query.
      * @param {Schema} values Values to set.
      * @param {FindOneAndUpdateOptions} options findOneAndUpdate method options.
      * @returns {Promise<StaticSchema>}
      */
    @JSImport("camo", "Document.findOneAndUpdate")
    @js.native
    def findOneAndUpdate[StaticSchema /* <: DocumentSchema */](query: js.Any, values: StaticSchema): js.Promise[StaticSchema] = js.native
    @JSImport("camo", "Document.findOneAndUpdate")
    @js.native
    def findOneAndUpdate[StaticSchema /* <: DocumentSchema */](query: js.Any, values: StaticSchema, options: FindOneAndUpdateOptions): js.Promise[StaticSchema] = js.native
  }
  
  @JSImport("camo", "connect")
  @js.native
  def connect(uri: String): js.Promise[_] = js.native
  
  @js.native
  trait DocumentSchema extends /**
    * Index signature
    */
  /* property */ StringDictionary[SchemaType] {
    
    /**
      * Document id
      */
    var _id: js.UndefOr[String] = js.native
  }
  object DocumentSchema {
    
    @scala.inline
    def apply(): DocumentSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSchema]
    }
    
    @scala.inline
    implicit class DocumentSchemaMutableBuilder[Self <: DocumentSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
  
  @js.native
  trait FindOneAndUpdateOptions extends StObject {
    
    /**
      * Return a new document if one is not found with the given query.
      *
      * @type {boolean}
      */
    var upsert: js.UndefOr[Boolean] = js.native
  }
  object FindOneAndUpdateOptions {
    
    @scala.inline
    def apply(): FindOneAndUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOneAndUpdateOptions]
    }
    
    @scala.inline
    implicit class FindOneAndUpdateOptionsMutableBuilder[Self <: FindOneAndUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  @js.native
  trait FindOneOptions extends StObject {
    
    /**
      * Find all or no references.
      * Pass an array of field names to only populate the specified references.
      *
      * @type {(boolean | string[])}
      */
    var populate: js.UndefOr[Boolean | js.Array[String]] = js.native
  }
  object FindOneOptions {
    
    @scala.inline
    def apply(): FindOneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOneOptions]
    }
    
    @scala.inline
    implicit class FindOneOptionsMutableBuilder[Self <: FindOneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopulate(value: Boolean | js.Array[String]): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      @scala.inline
      def setPopulateVarargs(value: String*): Self = StObject.set(x, "populate", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FindOptions extends StObject {
    
    /**
      * Limits the number of documents returned.
      *
      * @type {number}
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * Find all or no references.
      * Pass an array of field names to only populate the specified references.
      *
      * @type {(boolean | string[])}
      */
    var populate: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    /**
      * Skips the given number of documents and returns the rest.
      *
      * @type {number}
      */
    var skip: js.UndefOr[Double] = js.native
    
    /**
      * Sort the documents by the given field(s).
      *
      * @type {TypeOrArrayOfType<string>}
      */
    var sort: js.UndefOr[TypeOrArrayOfType[String]] = js.native
  }
  object FindOptions {
    
    @scala.inline
    def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    @scala.inline
    implicit class FindOptionsMutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setPopulate(value: Boolean | js.Array[String]): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      @scala.inline
      def setPopulateVarargs(value: String*): Self = StObject.set(x, "populate", js.Array(value :_*))
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSort(value: TypeOrArrayOfType[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value :_*))
    }
  }
  
  type SchemaType = TypeOrArrayOfType[String | Double | Boolean | Date | js.Object]
  
  type SchemaTypeConstructor = TypeOrArrayOfType[
    ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor
  ]
  
  type SchemaTypeExtended = SchemaTypeConstructor | SchemaTypeOptions[SchemaType]
  
  @js.native
  trait SchemaTypeOptions[Type] extends StObject {
    
    /**
      * Default value
      */
    var default: js.UndefOr[Type] = js.native
    
    /**
      * Posible options
      */
    var choices: js.UndefOr[js.Array[Type]] = js.native
    
    /**
      * RegEx to match value
      */
    var `match`: js.UndefOr[RegExp] = js.native
    
    /**
      * Max value (only with Number)
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Min value (only with Number)
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Required field
      */
    var required: js.UndefOr[Boolean] = js.native
    
    /**
      * Type of data
      */
    var `type`: SchemaTypeConstructor = js.native
    
    /**
      * Unique value (like ids)
      */
    var unique: js.UndefOr[Boolean] = js.native
    
    /**
      * Validation function.
      *
      * @param {Type} value Value taken.
      * @returns {boolean} true (validation ok) or false (validation wrong).
      */
    var validate: js.UndefOr[js.Function1[/* value */ Type, Boolean]] = js.native
  }
  object SchemaTypeOptions {
    
    @scala.inline
    def apply[Type](`type`: SchemaTypeConstructor): SchemaTypeOptions[Type] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaTypeOptions[Type]]
    }
    
    @scala.inline
    implicit class SchemaTypeOptionsMutableBuilder[Self <: SchemaTypeOptions[_], Type] (val x: Self with SchemaTypeOptions[Type]) extends AnyVal {
      
      @scala.inline
      def setChoices(value: js.Array[Type]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: Type*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: SchemaTypeConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(
        value: (ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor)*
      ): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      @scala.inline
      def setValidate(value: /* value */ Type => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
