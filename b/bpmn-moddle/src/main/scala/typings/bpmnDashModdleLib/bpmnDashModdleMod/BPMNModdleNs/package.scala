package typings
package bpmnDashModdleLib.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BPMNModdleNs {
  type AdHocOrdering = bpmnDashModdleLib.bpmnDashModdleLibStrings.Parallel | bpmnDashModdleLib.bpmnDashModdleLibStrings.Sequential
  // tslint:disable-next-line:no-empty-interface
  type Artifact = BaseElement
  type AssociationDirection = bpmnDashModdleLib.bpmnDashModdleLibStrings.None | bpmnDashModdleLib.bpmnDashModdleLibStrings.One | bpmnDashModdleLib.bpmnDashModdleLibStrings.Both
  // tslint:disable-next-line:no-empty-interface
  type Auditing = BaseElement
  // tslint:disable-next-line:no-empty-interface
  type BPMNEdge = LabeledEdge
  // tslint:disable-next-line:no-empty-interface
  type BPMNLabel = Label
  // tslint:disable-next-line:no-empty-interface
  type BPMNLabelStyle = Style
  // tslint:disable-next-line:no-empty-interface
  type BPMNPlane = Plane
  // tslint:disable-next-line:no-empty-interface
  type BPMNShape = LabeledShape
  // tslint:disable-next-line:no-empty-interface
  type Bounds = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type CancelEventDefinition = EventDefinition
  type ChoreographyLoopType = bpmnDashModdleLib.bpmnDashModdleLibStrings.None | bpmnDashModdleLib.bpmnDashModdleLibStrings.Standard | bpmnDashModdleLib.bpmnDashModdleLibStrings.MultiInstanceSequential | bpmnDashModdleLib.bpmnDashModdleLibStrings.MultiInstanceParallel
  // tslint:disable-next-line:no-empty-interface
  type ColoredEdge = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type ColoredShape = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type Conversation = ConversationNode
  // tslint:disable-next-line:no-empty-interface
  type DataInputAssociation = DataAssociation
  // tslint:disable-next-line:no-empty-interface
  type DataOutputAssociation = DataAssociation
  // tslint:disable-next-line:no-empty-interface
  type Diagram = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type DiagramElement = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type Edge = TypeDerived
  type ElementType = /* LimitUnionLength: was union type with length 163 */java.lang.String
  // tslint:disable-next-line:no-empty-interface
  type EndEvent = ThrowEvent
  // tslint:disable-next-line:no-empty-interface
  type EndPoint = RootElement
  type EventBasedGatewayType = bpmnDashModdleLib.bpmnDashModdleLibStrings.Parallel | bpmnDashModdleLib.bpmnDashModdleLibStrings.Exclusive
  // tslint:disable-next-line:no-empty-interface
  type EventDefinition = RootElement
  type GatewayDirection = bpmnDashModdleLib.bpmnDashModdleLibStrings.Unspecified | bpmnDashModdleLib.bpmnDashModdleLibStrings.Converging | bpmnDashModdleLib.bpmnDashModdleLibStrings.Diverging | bpmnDashModdleLib.bpmnDashModdleLibStrings.Mixed
  // tslint:disable-next-line:no-empty-interface
  type GlobalConversation = Collaboration
  // tslint:disable-next-line:no-empty-interface
  type GlobalManualTask = GlobalTask
  // tslint:disable-next-line:no-empty-interface
  type HumanPerformer = Performer
  // tslint:disable-next-line:no-empty-interface
  type ImplicitThrowEvent = ThrowEvent
  type ImportFn = js.Function3[
    /* err */ stdLib.Error, 
    /* definitions */ Definitions, 
    /* parseContext */ js.Any, 
    scala.Unit
  ]
  // tslint:disable-next-line:no-empty-interface
  type IntermediateCatchEvent = CatchEvent
  // tslint:disable-next-line:no-empty-interface
  type IntermediateThrowEvent = ThrowEvent
  type ItemKind = bpmnDashModdleLib.bpmnDashModdleLibStrings.Physical | bpmnDashModdleLib.bpmnDashModdleLibStrings.Information
  // tslint:disable-next-line:no-empty-interface
  type Label = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type LabeledEdge = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type LabeledShape = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type LoopCharacteristics = BaseElement
  // tslint:disable-next-line:no-empty-interface
  type ManualTask = Task
  // tslint:disable-next-line:no-empty-interface
  type Monitoring = BaseElement
  type MultiInstanceBehaviour = bpmnDashModdleLib.bpmnDashModdleLibStrings.None | bpmnDashModdleLib.bpmnDashModdleLibStrings.One | bpmnDashModdleLib.bpmnDashModdleLibStrings.All | bpmnDashModdleLib.bpmnDashModdleLibStrings.Complex
  // tslint:disable-next-line:no-empty-interface
  type Node = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type ParallelGateway = Gateway
  // tslint:disable-next-line:no-empty-interface
  type Performer = ResourceRole
  // tslint:disable-next-line:no-empty-interface
  type Plane = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type PotentialOwner = Performer
  type ProcessType = bpmnDashModdleLib.bpmnDashModdleLibStrings.None | bpmnDashModdleLib.bpmnDashModdleLibStrings.Public | bpmnDashModdleLib.bpmnDashModdleLibStrings.Private
  type RelationshipDirection = bpmnDashModdleLib.bpmnDashModdleLibStrings.None | bpmnDashModdleLib.bpmnDashModdleLibStrings.Forward | bpmnDashModdleLib.bpmnDashModdleLibStrings.Backward | bpmnDashModdleLib.bpmnDashModdleLibStrings.Both
  // tslint:disable-next-line:no-empty-interface
  type Rendering = BaseElement
  // tslint:disable-next-line:no-empty-interface
  type RootElement = BaseElement
  // tslint:disable-next-line:no-empty-interface
  type Shape = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type Style = TypeDerived
  // tslint:disable-next-line:no-empty-interface
  type TerminateEventDefinition = EventDefinition
}
