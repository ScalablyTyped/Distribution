package typings.convict.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalSchema[T] extends js.Object {
  
  var properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}}
    */ typings.convict.convictStrings.InternalSchema with TopLevel[js.Any] = js.native
}
object InternalSchema {
  
  @scala.inline
  def apply[T](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}}
    */ typings.convict.convictStrings.InternalSchema with TopLevel[js.Any]
  ): InternalSchema[T] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSchema[T]]
  }
  
  @scala.inline
  implicit class InternalSchemaOps[Self <: InternalSchema[_], T] (val x: Self with InternalSchema[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default :T[K]}}
      */ typings.convict.convictStrings.InternalSchema with TopLevel[js.Any]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
