package typings.convict.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalSchema[T] extends js.Object {
  var properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
    */ typings.convict.convictStrings.InternalSchema with TopLevel[js.Any]
}

object InternalSchema {
  @scala.inline
  def apply[T](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
    */ typings.convict.convictStrings.InternalSchema with TopLevel[js.Any]
  ): InternalSchema[T] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSchema[T]]
  }
}

