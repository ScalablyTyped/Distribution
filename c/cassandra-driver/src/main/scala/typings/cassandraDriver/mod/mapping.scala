package typings.cassandraDriver.mod

import typings.cassandraDriver.mappingMod.mapping.MappingOptions
import typings.cassandraDriver.mappingMod.mapping.q.QueryOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("cassandra-driver", "mapping.q.and")
    @js.native
    def and(condition1: js.Any, condition2: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.append")
    @js.native
    def append(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.decr")
    @js.native
    def decr(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.gt")
    @js.native
    def gt(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.gte")
    @js.native
    def gte(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.in_")
    @js.native
    def in(arr: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.incr")
    @js.native
    def incr(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.lt")
    @js.native
    def lt(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.lte")
    @js.native
    def lte(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.notEq")
    @js.native
    def notEq(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.prepend")
    @js.native
    def prepend(value: js.Any): QueryOperator = js.native
    
    @JSImport("cassandra-driver", "mapping.q.remove")
    @js.native
    def remove(value: js.Any): QueryOperator = js.native
  }
}
