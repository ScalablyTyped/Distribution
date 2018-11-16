package typings
package camoLib.camoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("camo", "Document")
@js.native
class Document[Schema /* <: DocumentSchema */] ()
  extends /**
		 * Index signature
		 */
/* property */ ScalablyTyped.runtime.StringDictionary[SchemaTypeExtended | java.lang.String | Document[_] | js.Function] {
  /**
  		 * Removes documents from the database.
  		 * Should only be used on an instantiated document with a valid id.
  		 *
  		 * @returns {Promise<number>} Number of deleted documents.
  		 */
  def delete(): stdLib.Promise[scala.Double] = js.native
  /**
  		 * post-delete hook.
  		 *
  		 * @protected
  		 * @returns {Promise<any>}
  		 */
  /* protected */ def postDelete(): stdLib.Promise[_] = js.native
  /**
  		 * post-save hook.
  		 *
  		 * @protected
  		 * @returns {Promise<any>}
  		 */
  /* protected */ def postSave(): stdLib.Promise[_] = js.native
  /**
  		 * post-validate hook.
  		 *
  		 * @protected
  		 * @returns {Promise<any>}
  		 */
  /* protected */ def postValidate(): stdLib.Promise[_] = js.native
  /**
  		 * pre-delete hook.
  		 *
  		 * @protected
  		 * @returns {Promise<any>}
  		 */
  /* protected */ def preDelete(): stdLib.Promise[_] = js.native
  /**
  		 * pre-save hook.
  		 *
  		 * @protected
  		 * @returns {Promise<any>}
  		 */
  /* protected */ def preSave(): stdLib.Promise[_] = js.native
  /**
  		 * pre-validate hook.
  		 *
  		 * @protected
  		 * @returns {Promise<any>}
  		 */
  /* protected */ def preValidate(): stdLib.Promise[_] = js.native
  /**
  		 * Saves the document instance to the database.
  		 *
  		 * @returns {Promise<Schema>}
  		 */
  def save(): stdLib.Promise[Schema] = js.native
  /**
  		 * Sets the schema (to be used on the constructor).
  		 *
  		 * @protected
  		 * @template Schema
  		 * @param {Schema} schema
  		 */
  /* protected */ def schema[Schema](schema: Schema): scala.Unit = js.native
  /**
  		 * Serialized document to just the data, which includes nested and referenced data.
  		 *
  		 * @returns {*}
  		 */
  def toJSON(): js.Any = js.native
}

@JSImport("camo", "Document")
@js.native
object Document extends js.Object {
  /**
  		 * Static method to define the collection name.
  		 *
  		 * @protected
  		 * @static
  		 * @returns {string} The collection name.
  		 */
  /* protected */ def collectionName(): java.lang.String = js.native
  /**
  		 * Number of matching documents without retrieving all the data.
  		 *
  		 * @static
  		 * @param {*} query Count query.
  		 * @returns {Promise<number>}
  		 */
  def count(query: js.Any): stdLib.Promise[scala.Double] = js.native
  /**
  		 * Creates a camo document instance.
  		 *
  		 * @static
  		 * @template StaticSchema
  		 * @param {StaticSchema} schema Base schema to create a document.
  		 * @returns {DocumentInstance<StaticSchema>} A camo document instance.
  		 */
  def create[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](schema: StaticSchema): camoLib.camoMod.Document[StaticSchema] = js.native
  /**
  		 * Removes all documents matching the query.
  		 *
  		 * @static
  		 * @param {*} query Delete query.
  		 * @returns {Promise<number>} Number of deleted documents.
  		 */
  def deleteMany(query: js.Any): stdLib.Promise[scala.Double] = js.native
  /**
  		 * Removes the first document found, even if multiple documents match the query.
  		 *
  		 * @static
  		 * @param {*} query Delete query.
  		 * @returns {Promise<number>} Number of deleted documents.
  		 */
  def deleteOne(query: js.Any): stdLib.Promise[scala.Double] = js.native
  /**
  		 * Return all documents matching the query.
  		 *
  		 * @static
  		 * @template StaticSchema
  		 * @param {*} query Find query.
  		 * @param {FindOptions} options
  		 * @returns {Promise<StaticSchema>}
  		 */
  def find[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](query: js.Any): stdLib.Promise[js.Array[StaticSchema]] = js.native
  /**
  		 * Return all documents matching the query.
  		 *
  		 * @static
  		 * @template StaticSchema
  		 * @param {*} query Find query.
  		 * @param {FindOptions} options
  		 * @returns {Promise<StaticSchema>}
  		 */
  def find[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](query: js.Any, options: camoLib.camoMod.FindOptions): stdLib.Promise[js.Array[StaticSchema]] = js.native
  /**
  		 * Return the first document found, even if multiple documents match the query.
  		 *
  		 * @static
  		 * @template StaticSchema
  		 * @param {*} query Find query.
  		 * @param {FindOneOptions} options findOne method options.
  		 * @returns {Promise<StaticSchema>}
  		 */
  def findOne[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](query: js.Any): stdLib.Promise[StaticSchema] = js.native
  /**
  		 * Return the first document found, even if multiple documents match the query.
  		 *
  		 * @static
  		 * @template StaticSchema
  		 * @param {*} query Find query.
  		 * @param {FindOneOptions} options findOne method options.
  		 * @returns {Promise<StaticSchema>}
  		 */
  def findOne[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](query: js.Any, options: camoLib.camoMod.FindOneOptions): stdLib.Promise[StaticSchema] = js.native
  /**
  		 * Find the first document and delete it.
  		 *
  		 * @static
  		 * @param {*} query Delete query.
  		 * @param {*} options Database Options for findOneAndDelete method.
  		 * @returns {Promise<number>} Number of deleted documents.
  		 */
  def findOneAndDelete(query: js.Any): stdLib.Promise[scala.Double] = js.native
  /**
  		 * Find the first document and delete it.
  		 *
  		 * @static
  		 * @param {*} query Delete query.
  		 * @param {*} options Database Options for findOneAndDelete method.
  		 * @returns {Promise<number>} Number of deleted documents.
  		 */
  def findOneAndDelete(query: js.Any, options: js.Any): stdLib.Promise[scala.Double] = js.native
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
  def findOneAndUpdate[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](query: js.Any, values: StaticSchema): stdLib.Promise[StaticSchema] = js.native
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
  def findOneAndUpdate[StaticSchema /* <: camoLib.camoMod.DocumentSchema */](query: js.Any, values: StaticSchema, options: camoLib.camoMod.FindOneAndUpdateOptions): stdLib.Promise[StaticSchema] = js.native
}

