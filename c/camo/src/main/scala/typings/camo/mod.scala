package typings.camo

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBufferConstructor
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("camo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("camo", "Document")
  @js.native
  open class Document[Schema /* <: DocumentSchema */] ()
    extends StObject
       with /**
    * Index signature
    */
  /* property */ StringDictionary[SchemaTypeExtended | String | Document[Any] | js.Function] {
    
    /**
      * Removes documents from the database.
      * Should only be used on an instantiated document with a valid id.
      *
      * @returns Number of deleted documents.
      */
    def delete(): js.Promise[Double] = js.native
    
    /**
      * post-delete hook.
      */
    /* protected */ def postDelete(): js.Promise[Any] = js.native
    
    /**
      * post-save hook.
      */
    /* protected */ def postSave(): js.Promise[Any] = js.native
    
    /**
      * post-validate hook.
      */
    /* protected */ def postValidate(): js.Promise[Any] = js.native
    
    /**
      * pre-delete hook.
      */
    /* protected */ def preDelete(): js.Promise[Any] = js.native
    
    /**
      * pre-save hook.
      */
    /* protected */ def preSave(): js.Promise[Any] = js.native
    
    /**
      * pre-validate hook.
      */
    /* protected */ def preValidate(): js.Promise[Any] = js.native
    
    /**
      * Saves the document instance to the database.
      */
    def save(): js.Promise[Schema] = js.native
    
    /**
      * Sets the schema (to be used on the constructor).
      */
    /* protected */ def schema[Schema](schema: Schema): Unit = js.native
    
    /**
      * Serialized document to just the data, which includes nested and referenced data.
      */
    def toJSON(): Any = js.native
  }
  /* static members */
  object Document {
    
    @JSImport("camo", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static method to define the collection name.
      *
      * @returns The collection name.
      */
    inline def collectionName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("collectionName")().asInstanceOf[String]
    
    /**
      * Number of matching documents without retrieving all the data.
      *
      * @param query Count query.
      */
    inline def count(query: Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    /**
      * Creates a camo document instance.
      *
      * @param schema Base schema to create a document.
      * @returns A camo document instance.
      */
    inline def create[StaticSchema /* <: DocumentSchema */](schema: StaticSchema): Document[StaticSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(schema.asInstanceOf[js.Any]).asInstanceOf[Document[StaticSchema]]
    
    /**
      * Removes all documents matching the query.
      *
      * @param query Delete query.
      * @returns Number of deleted documents.
      */
    inline def deleteMany(query: Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteMany")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    /**
      * Removes the first document found, even if multiple documents match the query.
      *
      * @param query Delete query.
      * @returns Number of deleted documents.
      */
    inline def deleteOne(query: Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteOne")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    
    /**
      * Return all documents matching the query.
      *
      * @param query Find query.
      */
    inline def find[StaticSchema /* <: DocumentSchema */](query: Any): js.Promise[js.Array[StaticSchema]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StaticSchema]]]
    inline def find[StaticSchema /* <: DocumentSchema */](query: Any, options: FindOptions): js.Promise[js.Array[StaticSchema]] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[StaticSchema]]]
    
    /**
      * Return the first document found, even if multiple documents match the query.
      *
      * @param query Find query.
      * @param options findOne method options.
      */
    inline def findOne[StaticSchema /* <: DocumentSchema */](query: Any): js.Promise[StaticSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StaticSchema]]
    inline def findOne[StaticSchema /* <: DocumentSchema */](query: Any, options: FindOneOptions): js.Promise[StaticSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StaticSchema]]
    
    /**
      * Find the first document and delete it.
      *
      * @param query Delete query.
      * @param options Database Options for findOneAndDelete method.
      * @returns Number of deleted documents.
      */
    inline def findOneAndDelete(query: Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOneAndDelete")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def findOneAndDelete(query: Any, options: Any): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneAndDelete")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    /**
      * Find and update (or insert) a document in one atomic operation (atomic for MongoDB only).
      *
      * @param query Find query.
      * @param values Values to set.
      * @param options findOneAndUpdate method options.
      */
    inline def findOneAndUpdate[StaticSchema /* <: DocumentSchema */](query: Any, values: StaticSchema): js.Promise[StaticSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneAndUpdate")(query.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StaticSchema]]
    inline def findOneAndUpdate[StaticSchema /* <: DocumentSchema */](query: Any, values: StaticSchema, options: FindOneAndUpdateOptions): js.Promise[StaticSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneAndUpdate")(query.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StaticSchema]]
  }
  
  inline def connect(uri: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  trait DocumentSchema
    extends StObject
       with /**
    * Index signature
    */
  /* property */ StringDictionary[SchemaType] {
    
    /**
      * Document id
      */
    var _id: js.UndefOr[String] = js.undefined
  }
  object DocumentSchema {
    
    inline def apply(): DocumentSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSchema]
    }
    
    extension [Self <: DocumentSchema](x: Self) {
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
  
  trait FindOneAndUpdateOptions extends StObject {
    
    /**
      * Return a new document if one is not found with the given query.
      */
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object FindOneAndUpdateOptions {
    
    inline def apply(): FindOneAndUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOneAndUpdateOptions]
    }
    
    extension [Self <: FindOneAndUpdateOptions](x: Self) {
      
      inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  trait FindOneOptions extends StObject {
    
    /**
      * Find all or no references.
      * Pass an array of field names to only populate the specified references.
      */
    var populate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  }
  object FindOneOptions {
    
    inline def apply(): FindOneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOneOptions]
    }
    
    extension [Self <: FindOneOptions](x: Self) {
      
      inline def setPopulate(value: Boolean | js.Array[String]): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setPopulateVarargs(value: String*): Self = StObject.set(x, "populate", js.Array(value*))
    }
  }
  
  trait FindOptions extends StObject {
    
    /**
      * Limits the number of documents returned.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Find all or no references.
      * Pass an array of field names to only populate the specified references.
      */
    var populate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Skips the given number of documents and returns the rest.
      */
    var skip: js.UndefOr[Double] = js.undefined
    
    /**
      * Sort the documents by the given field(s).
      */
    var sort: js.UndefOr[TypeOrArrayOfType[String]] = js.undefined
  }
  object FindOptions {
    
    inline def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    extension [Self <: FindOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPopulate(value: Boolean | js.Array[String]): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setPopulateVarargs(value: String*): Self = StObject.set(x, "populate", js.Array(value*))
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSort(value: TypeOrArrayOfType[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value*))
    }
  }
  
  type SchemaType = TypeOrArrayOfType[String | Double | Boolean | js.Date | js.Object]
  
  type SchemaTypeConstructor = TypeOrArrayOfType[
    ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor
  ]
  
  type SchemaTypeExtended = SchemaTypeConstructor | SchemaTypeOptions[SchemaType]
  
  trait SchemaTypeOptions[Type] extends StObject {
    
    /**
      * Default value
      */
    var default: js.UndefOr[Type] = js.undefined
    
    /**
      * Posible options
      */
    var choices: js.UndefOr[js.Array[Type]] = js.undefined
    
    /**
      * RegEx to match value
      */
    var `match`: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Max value (only with Number)
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Min value (only with Number)
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Required field
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of data
      */
    var `type`: SchemaTypeConstructor
    
    /**
      * Unique value (like ids)
      */
    var unique: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Validation function.
      *
      * @param value Value taken.
      * @returns true (validation ok) or false (validation wrong).
      */
    var validate: js.UndefOr[js.Function1[/* value */ Type, Boolean]] = js.undefined
  }
  object SchemaTypeOptions {
    
    inline def apply[Type](`type`: SchemaTypeConstructor): SchemaTypeOptions[Type] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaTypeOptions[Type]]
    }
    
    extension [Self <: SchemaTypeOptions[?], Type](x: Self & SchemaTypeOptions[Type]) {
      
      inline def setChoices(value: js.Array[Type]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: Type*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setDefault(value: Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: SchemaTypeConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(
        value: (ArrayBufferConstructor | ArrayConstructor | BooleanConstructor | DateConstructor | NumberConstructor | ObjectConstructor | StringConstructor)*
      ): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
      
      inline def setValidate(value: /* value */ Type => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type TypeOrArrayOfType[Type] = Type | js.Array[Type]
}
