package typings.dav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccountOptions = typings.dav.mod.Partial[typings.dav.mod.Account]
  type AddressBookOptions = typings.dav.mod.Partial[typings.dav.mod.AddressBook]
  type CalendarObjectOptions = typings.dav.mod.Partial[typings.dav.mod.CalendarObject]
  type CalendarOptions = typings.dav.mod.Partial[typings.dav.mod.Calendar]
  type CredentialsOptions = typings.dav.mod.Partial[typings.dav.mod.Credentials]
  type DAVCollectionOptions[T] = typings.dav.mod.Partial[typings.dav.mod.DAVCollection[T]]
  type DAVObjectOptions = typings.dav.mod.Partial[typings.dav.mod.DAVObject]
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.dav.davStrings.Partial with T
  type RequestOptions = typings.dav.mod.Partial[typings.dav.mod.Request_]
  type VCardOptions = typings.dav.mod.Partial[typings.dav.mod.VCard]
}
