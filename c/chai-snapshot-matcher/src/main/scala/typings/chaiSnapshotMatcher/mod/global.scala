package typings.chaiSnapshotMatcher.mod

import typings.chaiSnapshotMatcher.anon.Folder
import typings.mocha.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Chai extends js.Object {
    
    @js.native
    trait Assertion extends js.Object {
      
      def matchSnapshot(that: Context): Unit = js.native
      def matchSnapshot(that: Context, hint: String): Unit = js.native
      
      def matchSpecificSnapshot(that: Context): Unit = js.native
      def matchSpecificSnapshot(that: Context, options: Folder): Unit = js.native
    }
  }
}
