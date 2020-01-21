package typings.awsSdkClientKmsBrowser.typesInvalidAliasNameExceptionMod

import typings.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidAliasNameException
  extends ServiceException[InvalidAliasNameExceptionDetails]
     with CreateAliasExceptionsUnion {
  @JSName("name")
  var name_InvalidAliasNameException: typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidAliasNameException = js.native
}

