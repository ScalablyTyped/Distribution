package typings.cassandraDriver.mod

import typings.cassandraDriver.mappingMod.mapping.MappingOptions
import typings.cassandraDriver.mappingMod.mapping.q.QueryOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapping {
  
  @JSImport("cassandra-driver", "mapping.DefaultTableMappings")
  @js.native
  class DefaultTableMappings ()
    extends typings.cassandraDriver.mappingMod.mapping.DefaultTableMappings
  
  @JSImport("cassandra-driver", "mapping.Mapper")
  @js.native
  class Mapper protected ()
    extends typings.cassandraDriver.mappingMod.mapping.Mapper {
    def this(client: Client) = this()
    def this(client: Client, options: MappingOptions) = this()
  }
  
  @JSImport("cassandra-driver", "mapping.UnderscoreCqlToCamelCaseMappings")
  @js.native
  class UnderscoreCqlToCamelCaseMappings ()
    extends typings.cassandraDriver.mappingMod.mapping.UnderscoreCqlToCamelCaseMappings
  
  object q {
    
    @JSImport("cassandra-driver", "mapping.q")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def and(condition1: js.Any, condition2: js.Any): QueryOperator = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(condition1.asInstanceOf[js.Any], condition2.asInstanceOf[js.Any])).asInstanceOf[QueryOperator]
    
    @scala.inline
    def append(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def decr(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("decr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def gt(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def gte(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("gte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def in(arr: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("in_")(arr.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def incr(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("incr")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def lt(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def lte(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("lte")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def notEq(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("notEq")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def prepend(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
    
    @scala.inline
    def remove(value: js.Any): QueryOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(value.asInstanceOf[js.Any]).asInstanceOf[QueryOperator]
  }
}
