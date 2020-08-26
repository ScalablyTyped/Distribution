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
  def this(message: js.UndefOr[scala.Nothing], options: Options[Data]) = this()
  def this(message: String, options: Options[Data]) = this()
  def this(message: Error, options: Options[Data]) = this()
}

