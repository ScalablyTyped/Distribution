package typings.blackEngine

import org.scalablytyped.runtime.Instantiable0
import typings.blackEngine.componentMod.Component
import typings.blackEngine.dirtyFlagMod.DirtyFlag
import typings.blackEngine.matrixMod.Matrix
import typings.blackEngine.messageDispatcherMod.MessageDispatcher
import typings.blackEngine.rectangleMod.Rectangle
import typings.blackEngine.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameObjectMod {
  
  @JSImport("black-engine/core/GameObject", "GameObject")
  @js.native
  open class GameObject () extends MessageDispatcher {
    
    /* private */ var __setParent: Any = js.native
    
    /* private */ var __update: Any = js.native
    
    /* private */ var __updatePivots: Any = js.native
    
    def add(gameObjectsAndOrComponents: (GameObject | Component)*): GameObject = js.native
    
    def addChild(child: GameObject): GameObject = js.native
    
    def addChildAt(child: GameObject): GameObject = js.native
    def addChildAt(child: GameObject, index: Double): GameObject = js.native
    
    def addComponent(component: Component): Component = js.native
    
    def addComponentAt(component: Component): Component = js.native
    def addComponentAt(component: Component, index: Double): Component = js.native
    
    def alignAnchor(): GameObject = js.native
    def alignAnchor(ax: Double): GameObject = js.native
    def alignAnchor(ax: Double, ay: Double): GameObject = js.native
    def alignAnchor(ax: Unit, ay: Double): GameObject = js.native
    
    def alignPivot(): GameObject = js.native
    def alignPivot(ax: Double): GameObject = js.native
    def alignPivot(ax: Double, ay: Double): GameObject = js.native
    def alignPivot(ax: Unit, ay: Double): GameObject = js.native
    
    def alignPivotOffset(): GameObject = js.native
    def alignPivotOffset(ax: Double): GameObject = js.native
    def alignPivotOffset(ax: Double, ay: Double): GameObject = js.native
    def alignPivotOffset(ax: Double, ay: Double, includeChildren: Boolean): GameObject = js.native
    def alignPivotOffset(ax: Double, ay: Unit, includeChildren: Boolean): GameObject = js.native
    def alignPivotOffset(ax: Unit, ay: Double): GameObject = js.native
    def alignPivotOffset(ax: Unit, ay: Double, includeChildren: Boolean): GameObject = js.native
    def alignPivotOffset(ax: Unit, ay: Unit, includeChildren: Boolean): GameObject = js.native
    
    def anchorX: Double = js.native
    def anchorX_=(arg: Double): Unit = js.native
    
    def anchorY: Double = js.native
    def anchorY_=(arg: Double): Unit = js.native
    
    def bounds: Rectangle = js.native
    
    def checkStatic(): Boolean = js.native
    def checkStatic(includeChildren: Boolean): Boolean = js.native
    
    def getBounds(): Rectangle = js.native
    def getBounds(space: Unit, includeChildren: Boolean): Rectangle = js.native
    def getBounds(space: Unit, includeChildren: Boolean, outRect: Rectangle): Rectangle = js.native
    def getBounds(space: Unit, includeChildren: Unit, outRect: Rectangle): Rectangle = js.native
    def getBounds(space: GameObject): Rectangle = js.native
    def getBounds(space: GameObject, includeChildren: Boolean): Rectangle = js.native
    def getBounds(space: GameObject, includeChildren: Boolean, outRect: Rectangle): Rectangle = js.native
    def getBounds(space: GameObject, includeChildren: Unit, outRect: Rectangle): Rectangle = js.native
    
    def getChildAt(index: Double): GameObject = js.native
    
    def getChildByName(name: String): GameObject | Null = js.native
    
    def getComponent(typeName: Instantiable0[Component]): Component | Null = js.native
    
    def getComponentAt(index: Double): Component | Null = js.native
    
    def getStageBounds(): Rectangle = js.native
    def getStageBounds(outRect: Rectangle): Rectangle = js.native
    
    def globalToLocal(globalPoint: Vector): Vector = js.native
    def globalToLocal(globalPoint: Vector, outVector: Vector): Vector = js.native
    
    def height: Double = js.native
    def height_=(arg: Double): Unit = js.native
    
    def hitTest(localPoint: Vector): GameObject | Null = js.native
    
    def id: Double = js.native
    
    def localBounds: Rectangle = js.native
    
    def localHeight: Double = js.native
    
    def localToGlobal(localPoint: Vector): Vector = js.native
    def localToGlobal(localPoint: Vector, outVector: Vector): Vector = js.native
    
    def localTransformation: Matrix = js.native
    def localTransformation_=(arg: Matrix): Unit = js.native
    
    def localWidth: Double = js.native
    
    /* private */ var mAdded: Any = js.native
    
    /* protected */ var mAnchorX: Double | Null = js.native
    
    /* protected */ var mAnchorY: Double | Null = js.native
    
    /* protected */ var mBoundsCache: Rectangle = js.native
    
    /* private */ var mChildOrComponentBeenAdded: Any = js.native
    
    /* protected */ var mChildren: js.Array[GameObject] = js.native
    
    /* private */ var mChildrenClone: Any = js.native
    
    /* private */ var mCollidersCache: Any = js.native
    
    /* private */ var mComponentClone: Any = js.native
    
    /* private */ var mComponents: Any = js.native
    
    /* private */ var mDirty: Any = js.native
    
    /* private */ var mDirtyFrameNum: Any = js.native
    
    /* private */ var mId: Any = js.native
    
    /* private */ var mLocalTransform: Any = js.native
    
    /* private */ var mName: Any = js.native
    
    /* private */ var mNumChildrenRemoved: Any = js.native
    
    /* private */ var mNumComponentsRemoved: Any = js.native
    
    /* protected */ var mParent: GameObject = js.native
    
    /* protected */ var mPivotOffsetX: Double = js.native
    
    /* protected */ var mPivotOffsetY: Double = js.native
    
    /* protected */ var mPivotX: Double = js.native
    
    /* protected */ var mPivotY: Double = js.native
    
    /* private */ var mRotation: Any = js.native
    
    /* private */ var mScaleX: Any = js.native
    
    /* private */ var mScaleY: Any = js.native
    
    /* protected */ var mSkewX: Double = js.native
    
    /* protected */ var mSkewY: Double = js.native
    
    /* private */ var mSuspendDirty: Any = js.native
    
    /* private */ var mTag: Any = js.native
    
    /* private */ var mWorldTransform: Any = js.native
    
    /* private */ var mWorldTransformInverted: Any = js.native
    
    /* private */ var mX: Any = js.native
    
    /* private */ var mY: Any = js.native
    
    def make(values: Any): GameObject = js.native
    
    def name: String = js.native
    def name_=(arg: String): Unit = js.native
    
    def numChildren: Double = js.native
    
    def numComponents: Double = js.native
    
    def onAdded(): Unit = js.native
    
    /* protected */ def onGetLocalBounds(): Rectangle = js.native
    /* protected */ def onGetLocalBounds(outRect: Rectangle): Rectangle = js.native
    
    /* protected */ def onHitTest(localPoint: Vector): Boolean = js.native
    
    /* protected */ def onHitTestMask(localPoint: Vector): Boolean = js.native
    
    def onRemoved(): Unit = js.native
    
    /* protected */ def onUpdate(): Unit = js.native
    
    def pivotOffsetX: Double = js.native
    def pivotOffsetX_=(arg: Double): Unit = js.native
    
    def pivotOffsetY: Double = js.native
    def pivotOffsetY_=(arg: Double): Unit = js.native
    
    def pivotX: Double = js.native
    
    def pivotY: Double = js.native
    
    def relativeTo(gameObject: GameObject): Vector = js.native
    def relativeTo(gameObject: GameObject, outVector: Vector): Vector = js.native
    
    def removeAllChildren(): GameObject = js.native
    
    def removeAllComponents(): GameObject = js.native
    
    def removeChild(child: GameObject): GameObject = js.native
    
    def removeChildAt(index: Double): GameObject | Null = js.native
    
    def removeComponent(instance: Component): Component | Null = js.native
    
    def removeComponentAt(index: Double): Component | Null = js.native
    
    def removeFromParent(): GameObject = js.native
    
    def root: GameObject = js.native
    
    def rotation: Double = js.native
    def rotation_=(arg: Double): Unit = js.native
    
    def scale: Double = js.native
    
    def scaleX: Double = js.native
    def scaleX_=(arg: Double): Unit = js.native
    
    def scaleY: Double = js.native
    def scaleY_=(arg: Double): Unit = js.native
    
    def scale_=(arg: Double): Unit = js.native
    
    def setChildIndex(child: GameObject, index: Double): GameObject = js.native
    
    def setDirty(flag: DirtyFlag): Unit = js.native
    def setDirty(flag: DirtyFlag, includeChildren: Boolean): Unit = js.native
    
    def setParentDirty(flag: DirtyFlag): Unit = js.native
    
    def setRenderDirty(): Unit = js.native
    
    def setTransform(
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      r: js.UndefOr[Double],
      scaleX: js.UndefOr[Double],
      scaleY: js.UndefOr[Double],
      anchorX: js.UndefOr[Double],
      anchorY: js.UndefOr[Double],
      includeChildren: js.UndefOr[Boolean]
    ): GameObject = js.native
    
    def setTransformDirty(): Unit = js.native
    
    def skewX: Double = js.native
    def skewX_=(arg: Double): Unit = js.native
    
    def skewY: Double = js.native
    def skewY_=(arg: Double): Unit = js.native
    
    def spawn(gen: js.Function0[Unit]): Any = js.native
    def spawn(gen: js.Function0[Unit], ctx: Any): Any = js.native
    
    def tag: String = js.native
    def tag_=(arg: String): Unit = js.native
    
    def touchable: Boolean = js.native
    def touchable_=(arg: Boolean): Unit = js.native
    
    def wait(seconds: Double): js.Function1[/* arg0 */ Any, Any] = js.native
    
    def waitMessage(message: String): js.Function1[/* arg0 */ Any, Any] = js.native
    
    def width: Double = js.native
    def width_=(arg: Double): Unit = js.native
    
    def worldTransformation: Matrix = js.native
    
    def worldTransformationInverted: Matrix = js.native
    
    def x: Double = js.native
    def x_=(arg: Double): Unit = js.native
    
    def xy: Vector = js.native
    def xy_=(arg: Vector): Unit = js.native
    
    def y: Double = js.native
    def y_=(arg: Double): Unit = js.native
  }
  /* static members */
  object GameObject {
    
    @JSImport("black-engine/core/GameObject", "GameObject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def find(name: String): GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any]).asInstanceOf[GameObject]
    inline def find(name: String, node: GameObject): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(name.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    
    inline def findById(id: Double): GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[GameObject]
    inline def findById(id: Double, node: GameObject): GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[GameObject]
    
    inline def findComponents(gameObject: GameObject, `type`: Instantiable0[Component]): js.Array[Component] = (^.asInstanceOf[js.Dynamic].applyDynamic("findComponents")(gameObject.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Component]]
    
    inline def findWithTag(tag: String): js.Array[GameObject] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findWithTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Array[GameObject] | Null]
    
    inline def forEach(gameObject: GameObject, action: js.Function1[/* arg0 */ this.type, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(gameObject.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getBoundsWithPoints(points: js.Array[Double], worldTransformation: Matrix): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    inline def getBoundsWithPoints(points: js.Array[Double], worldTransformation: Matrix, outRect: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getBoundsWithPoints")(points.asInstanceOf[js.Any], worldTransformation.asInstanceOf[js.Any], outRect.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    inline def intersects(gameObject: GameObject, point: Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def intersectsAt(gameObject: GameObject, point: Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def intersectsAt(gameObject: GameObject, point: Vector, outVector: Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsAt")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any], outVector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def intersectsWith(gameObject: GameObject, point: Vector): GameObject | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectsWith")(gameObject.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[GameObject | Null]
  }
}
