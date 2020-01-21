package typings.boom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
  * @see {@link https://github.com/hapijs/boom#boom}
  */
@JSImport("boom", JSImport.Namespace)
@js.native
/** Creates a new Boom object using the provided message and then calling boomify() to decorate the error with the Boom properties. */
class ^[Data] () extends Boom[Data] {
  def this(message: String) = this()
  def this(message: Error) = this()
  def this(message: String, options: Options[Data]) = this()
  def this(message: Error, options: Options[Data]) = this()
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  /* CompleteClass */
  override var data: Data = js.native
  /** isBoom - if true, indicates this is a Boom object instance. */
  /* CompleteClass */
  override var isBoom: Boolean = js.native
  /** isServer - convenience bool indicating status code >= 500. */
  /* CompleteClass */
  override var isServer: Boolean = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  /* CompleteClass */
  override var output: Output = js.native
  /** reformat() - rebuilds error.output using the other object properties. */
  /* CompleteClass */
  override def reformat(): String = js.native
  /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
  /* CompleteClass */
  override def typeof(): js.Any = js.native
}

