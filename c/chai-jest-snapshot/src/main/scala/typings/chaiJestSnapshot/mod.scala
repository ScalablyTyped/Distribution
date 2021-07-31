package typings.chaiJestSnapshot

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.mocha.Mocha.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-jest-snapshot", JSImport.Namespace)
  @js.native
  val ^ : ChaiJestSnapshot = js.native
  
  @js.native
  trait ChaiJestSnapshot extends ChaiPlugin {
    
    /** Add a serializer plugin */
    def addSerializer(serializer: js.Any): Unit = js.native
    
    /** Configure snapshot name using mocha context */
    def configureUsingMochaContext(context: Context): Unit = js.native
    
    /** Reset snapshot registry */
    def resetSnapshotRegistry(): Unit = js.native
    
    /** Set snapshot file name */
    def setFilename(filename: String): Unit = js.native
    
    /**
      * Set snapshot test name
      */
    def setTestName(testname: String): Unit = js.native
  }
  
  type _To = ChaiJestSnapshot
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiJestSnapshot = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        /** Assert that the object matches the snapshot */
        def matchSnapshot(): Assertion = js.native
        def matchSnapshot(snapshotFilename: String): Assertion = js.native
        def matchSnapshot(snapshotFilename: String, snapshotName: String): Assertion = js.native
        def matchSnapshot(snapshotFilename: String, snapshotName: String, update: Boolean): Assertion = js.native
        def matchSnapshot(snapshotFilename: String, snapshotName: Unit, update: Boolean): Assertion = js.native
        def matchSnapshot(snapshotFilename: Unit, snapshotName: String): Assertion = js.native
        def matchSnapshot(snapshotFilename: Unit, snapshotName: String, update: Boolean): Assertion = js.native
        def matchSnapshot(snapshotFilename: Unit, snapshotName: Unit, update: Boolean): Assertion = js.native
        def matchSnapshot(update: Boolean): Assertion = js.native
      }
    }
  }
}
