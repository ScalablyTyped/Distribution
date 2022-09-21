package typings.cassanknex.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cassanknex.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): CassanKnex = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CassanKnex]
inline def apply(options: DriverOptions): CassanKnex = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CassanKnex]

type MappedDict[B] = StringDictionary[B]

type SelectAsClause[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: string}
  */ typings.cassanknex.cassanknexStrings.SelectAsClause & TopLevel[Any]

/**
  * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
  */
type TypeMatchedValue[T, K /* <: /* keyof T */ String */, Type, This] = This
