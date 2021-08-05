package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): typings.cassanknex.mod.CassanKnex = typings.cassanknex.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.cassanknex.mod.CassanKnex]
inline def apply(options: typings.cassanknex.mod.DriverOptions): typings.cassanknex.mod.CassanKnex = typings.cassanknex.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.cassanknex.mod.CassanKnex]

type MappedDict[B] = org.scalablytyped.runtime.StringDictionary[B]

type SelectAsClause[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: string}
  */ typings.cassanknex.cassanknexStrings.SelectAsClause & org.scalablytyped.runtime.TopLevel[js.Any]

/**
  * Will return the `never` type if `T[K]` is not a member of `Type`, for all `T[K]`.
  */
type TypeMatchedValue[T, K /* <: /* keyof T */ java.lang.String */, Type, This] = This
