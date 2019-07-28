package typings.dav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object davMod {
  type AccountOptions = Partial[Account]
  type AddressBookOptions = Partial[AddressBook]
  type CalendarObjectOptions = Partial[CalendarObject]
  type CalendarOptions = Partial[Calendar]
  type CredentialsOptions = Partial[Credentials]
  type DAVCollectionOptions[T] = Partial[DAVCollection[T]]
  type DAVObjectOptions = Partial[DAVObject]
  type Partial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.dav.davStrings.Partial with T
  type RequestOptions = Partial[Request]
  type VCardOptions = Partial[VCard]
}
